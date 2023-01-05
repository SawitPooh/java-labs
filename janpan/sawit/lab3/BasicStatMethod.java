package janpan.sawit.lab3;

/**
 * This BasicStatMethod program accept to input at least 1 number or at most 1 number.
 * 
 * Example output format is
 * Enter numbers (separated by space): 5
 * Sorted numbers is 5.0
 * Minimum: 5.00
 * Maximum: 5.00
 * Average: 5.00
 * Median: 5.00
 * Standard Deviation: 0.00
 * Author: Sawit Janpan
 * ID: 653040463-7
 * Sec: 2
 * Date: January 5, 2023
 **/

import java.lang.Math;
import java.text.DecimalFormat;
import java.util.Scanner;

public class BasicStatMethod {
    public static String getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers (separated by space): ");
        String input = sc.nextLine();
        sc.close();
        return input;

    }

    public static void calculateStat(String input) {
        DecimalFormat decfor = new DecimalFormat("0.00");
        String[] strNum = input.split(" ");
        int num_input = strNum.length;

        if (input.equals("")) {
            System.out.println("Please enter at least one number.");
        } else if (num_input > 1) {
            System.out.println("Please enter at most one number.");
        } else if (num_input == 1) {
            double[] number = new double[1];
            number[0] = Double.parseDouble(input);

            System.out.println("Sorted numbers is " + number[0]);
            System.out.println("Minimum: " + decfor.format(number[0]));
            System.out.println("Maximum: " + decfor.format(number[num_input - 1]));

            double sum = 0;
            double avg = 0;
            for (int i = 0; i < num_input; i++) {
                sum = sum + number[i];
                avg = sum / num_input;
            }
            System.out.println("Average: " + decfor.format(avg));

            if (num_input % 2 != 0) {
                double median = number[((num_input + 1) / 2) - 1];
                System.out.println("Median: " + decfor.format(median));
            } else if (num_input % 2 == 0) {
                int seq = (num_input + 1) / 2;
                double median = (number[seq - 1] + number[seq]) / 2;
                System.out.println("Median: " + decfor.format(median));
            }

            double sd = 0;
            double variance = 0;
            for (int i = 0; i < num_input; i++) {
                variance += Math.pow((number[i] - avg), 2) / (num_input);
                sd = Math.sqrt(variance);
            }
            System.out.println("Standard Deviation: " + decfor.format(sd));
        }

    }

    public static void main(String[] args) {
        String input = getInput();
        calculateStat(input);

    }

}
