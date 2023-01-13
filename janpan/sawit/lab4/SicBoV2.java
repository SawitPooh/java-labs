package janpan.sawit.lab4;

/**
 * This SicBoMethod program accept to input type of number first then the player can choose to play the game in two ways:
 * To Use this Program:
 * 1. Choosing high or low on the total of the three dice. If the total is between 3-10 then the total is low. If the total is between 11-18 then the total is high. If the player bets correctly, he/she wins 20 Baht. For example, if the player chooses high and the total is 15 then the player receives 20 Baht. If the player bets incorrectly then the player loses 10 Baht.
 * 2. Choosing a number between 1-6 that will be on the three dice. If the player bets correctly,The calculation of the reward is slightly different. When the player plays the game by choosing a number between 1-6. The reward would be 10 * number_of_dice_matches * (the_last_digit_of_id_number%5+1) baht
 * 3.You can play again with key A and choose the other keys to exit.
 * 
 * Enter your choice: 1 //
 * Type in h for high and l for low:h
 * Dice 1 is : 2, Dice 2 is : 5, Dice 3 is :5
 * Total is 12
 * You win 20 Baht.
 * 
 * Enter your choice: 2 //
 * Type in a number to bet on (1-6): 5 
 * Dice 1 is : 2, Dice 2 is : 5, Dice 3 is : 5
 * You win 60 Baht.
 * Type in a number to bet on (1-6): 5
 * Dice 1 is : 3, Dice 2 is : 2, Dice 3 is : 4
 * You lose 10 Baht.
 *
 * Press A to play again. Press the other keys to exit. //
 * 
 * 
 * @author : Sawit Janpan
 * ID: 653040463-7
 * Sec: 2
 * @version 1.0 Date: January 13, 2023
 **/

import java.util.Scanner;
import java.util.Random;

public class SicBoV2 {
    static Scanner scanner = new Scanner(System.in);

    public static String getChoice() {
        System.out.println("Choose how do you want to bet: ");
        System.out.println("Type 1 for choosing high or low numbers.");
        System.out.println("Type 2 for choosing number between 1-6.");
        System.out.print("Enter your choice: ");
        String enter_choice = scanner.nextLine();
        return enter_choice;
    }

    public static void playGame(String enter_choice) {
        Random random = new Random();
        if (enter_choice.equals("1")) {
            System.out.print("Type in h for high and l for low: ");
            String type_high_low = scanner.nextLine();
            int random_dice1 = random.nextInt(6) + 1;
            int random_dice2 = random.nextInt(6) + 1;
            int random_dice3 = random.nextInt(6) + 1;
            int total_dice = random_dice1 + random_dice2 + random_dice3;
            if (type_high_low.equalsIgnoreCase("h")) {
                System.out
                        .println("Dice 1 is : " + random_dice1 + ", Dice 2 is : " + random_dice2 + ", Dice 3 is : "
                                + random_dice3);
                System.out.println("Total is " + (total_dice));
                if (total_dice >= 11) {
                    System.out.println("You win 20 Baht.");
                } else {
                    System.out.println("You lose 10 Baht.");
                }
            } else if (type_high_low.equalsIgnoreCase("l")) {
                System.out.println("Dice 1 is : " + random_dice1 + ", Dice 2 is : " + random_dice2 + ", Dice 3 is : "+ random_dice3);
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
            String bet_numString = scanner.nextLine();
            if (bet_numString.equals("1") || bet_numString.equals("2") || bet_numString.equals("3")
                    || bet_numString.equals("4") || bet_numString.equals("5") || bet_numString.equals("6")) {
                int bet_num = Integer.parseInt(bet_numString);
                int random_dice1 = random.nextInt(6) + 1;
                int random_dice2 = random.nextInt(6) + 1;
                int random_dice3 = random.nextInt(6) + 1;
                if (bet_num <= 6) {
                    System.out.println("Dice 1 is : " + random_dice1 + ", Dice 2 is : " + random_dice2
                            + ", Dice 3 is : " + random_dice3);
                    if (bet_num == random_dice1 && bet_num == random_dice2 && bet_num == random_dice3) {
                        System.out.println("You win " + 3 * 10 * (7 % 5 + 1) + " Baht.");

                    } else if ((bet_num == random_dice1) && (bet_num == random_dice2)
                            || (bet_num == random_dice1) && (bet_num == random_dice3)
                            || (bet_num == random_dice2) && (bet_num == random_dice3)) {
                        System.out.println("You win " + 2 * 10 * (7 % 5 + 1) + " Baht.");

                    } else if (bet_num == random_dice1 || bet_num == random_dice2 || bet_num == random_dice3) {

                        System.out.println("You win " + 1 * 10 * (7 % 5 + 1) + " Baht.");

                    } else {
                        System.out.println("You lose 10 Baht.");

                    }

                }
            } else {
                System.out.println("Incorrect input. Enter a number between 1-6 only.");
            }

        } else {
            System.out.println("Incorrect input. Enter 1 or 2 only.");
        }

    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("Welcome to สวิตต์ จันทร์แป้น (653040463-7) Game:");
            String input = getChoice();
            playGame(input);
            System.out.println("Press A to play again. Press the other keys to exit.");
            String a = scanner.nextLine();
            if (a.equalsIgnoreCase("a")) {
                continue;
            } else {
                System.out.println("Good Bye!");
                break;
            }
        }

    }

}
