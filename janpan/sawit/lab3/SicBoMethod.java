package janpan.sawit.lab3;

/**
 * This SicBoMethod program accept to input type of number first then the player can choose to play the game in two ways:
 * 1. Choosing high or low on the total of the three dice. If the total is between 3-10 then the total is low. If the total is between 11-18 then the total is high. If the player bets correctly, he/she wins 20 Baht. For example, if the player chooses high and the total is 15 then the player receives 20 Baht. If the player bets incorrectly then the player loses 10 Baht.
 * 2. Choosing a number between 1-6 that will be on the three dice. If the player bets correctly, the player receives 3 times the amount of money that the player bets for each dice which is 10 Baht. For example, if the player chooses the number 3 and the three dices are 3, 6, and 3. This means the player is correct for two dice then he receives 3 * 10 + 3*10 = 60 Baht in total.
 * 
 * Enter your choice: 1 //
 * Type in h for high and l for low:h
 * Dice 1 is : 2, Dice 2 is : 5, Dice 3 is :5
 * Total is 12
 * You win 20 Baht.
 * 
 * Enter your choice: 2 //
 * Type in a number to bet on (1-6): 5
 * Dice 1 is : 3, Dice 2 is : 2, Dice 3 is : 4
 * You lose 10 Baht.
 *
 * Author: Sawit Janpan
 * ID: 653040463-7
 * Sec: 2
 * Date: January 5, 2023
 **/

import java.util.Scanner;
import java.util.Random;

public class SicBoMethod {

    public static void getChoice() {
        System.out.println("Choose how do you want to bet:");
        System.out.println("Type 1 for choosing high or low numbers.");
        System.out.println("Type 2 for choosing number between 1-6.");
        System.out.print("Enter your choice: ");
    }

    public static void playGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String enter_choice = scanner.nextLine();
        if (enter_choice.equals("1")) {
            System.out.print("Type in h for high and l for low:");
            String type_high_low = scanner.next();
            int random_dice1 = random.nextInt(6) + 1;
            int random_dice2 = random.nextInt(6) + 1;
            int random_dice3 = random.nextInt(6) + 1;
            int total_dice = random_dice1 + random_dice2 + random_dice3;
            if (type_high_low.equalsIgnoreCase("h") == true) {
                System.out.println("Dice 1 is : " + random_dice1 + ", Dice 2 is : " + random_dice2 + ", Dice 3 is :"
                        + random_dice3);
                System.out.println("Total is " + (total_dice));
                if (total_dice >= 11) {
                    System.out.println("You win 20 Baht.");
                } else {
                    System.out.println("You lose 10 Baht.");
                }
            } else if (type_high_low.equalsIgnoreCase("l") == true) {
                System.out.println("Dice 1 is : " + random_dice1 + ", Dice 2 is : " + random_dice2 + ", Dice 3 is :"
                        + random_dice3);
                if (total_dice < 11) {
                    System.out.println("You win 20 Baht.");
                } else {
                    System.out.println("You lose 10 Baht.");
                }
            } else {
                System.out.println("Incorrect input. Enter h for high and l for low only.");
            }
        } else if (enter_choice.equals("2")) {
            System.out.print("Type in a number to bet on (1-6): ");
            int bet_num = scanner.nextInt();
            int random_dice1 = random.nextInt(6) + 1;
            int random_dice2 = random.nextInt(6) + 1;
            int random_dice3 = random.nextInt(6) + 1;
            if (bet_num <= 6) {
                System.out.println("Dice 1 is : " + random_dice1 + ", Dice 2 is : " + random_dice2 + ", Dice 3 is :"
                        + random_dice3);
                if (bet_num == random_dice1 && bet_num == random_dice2 && bet_num == random_dice3) {
                    System.out.println("You win 90 Baht.");
                } else if ((bet_num == random_dice1) && (bet_num == random_dice2)
                        || (bet_num == random_dice1) && (bet_num == random_dice3)
                        || (bet_num == random_dice2) && (bet_num == random_dice3)) {
                    System.out.println("You win 60 Baht.");
                } else if (bet_num == random_dice1 || bet_num == random_dice2 || bet_num == random_dice3) {
                    System.out.println("You win 30 Baht.");
                } else {
                    System.out.println("You lose 10 Baht.");
                }

            } else {
                System.out.print("Incorrect input. Enter a number between 1-6 only.");
            }

        } else {
            System.out.println("Incorrect input. Enter 1 or 2 only.");
        }
        scanner.close();
    }

    static int chioce;

    public static void main(String[] args) {
        getChoice();
        playGame();
    }

}
