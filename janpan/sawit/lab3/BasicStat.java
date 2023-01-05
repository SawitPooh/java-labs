package janpan.sawit.lab3;

/**
 * This BasicStat program accept to input at least 1 number or at most 10 numbers.
 * 
 * Example output format is
 * Enter numbers (separated by space): 1.1 2.2                                                                                                                          Sorted numbers are 1.1 2.2 
 * Minimum: 1.10
 * Maximum: 2.20
 * Average: 1.65
 * Median: 1.65
 * Standard Deviation: 0.55
 * Author: Sawit Janpan
 * ID: 653040463-7
 * Sec: 2
 * Date: January 5, 2023
 **/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.Math;
import java.text.DecimalFormat;

public class BasicStat {
    public static void main(String[] args)
            throws IOException {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat decfor = new DecimalFormat("0.00");
        double[] numbers = new double[10];
        String[] strNums;

        System.out.print("Enter numbers (separated by space): ");
        strNums = bi.readLine().split(" ");
        int num_input = strNums.length;

        if (num_input <= 1) {
            System.out.println("Please enter at least one number.");

        } else if (num_input > 10) {
            System.out.println("Please enter at most 10 numbers.");

        } else if (num_input > 0) {
            for (int i = 0; i < num_input; i++) {
                numbers[i] = Double.parseDouble(strNums[i]);
            }

            int lastIndex = num_input - 1;
            for (int lastPlace = lastIndex; lastPlace >= 1; lastPlace--) {
                int maxLoc = 0;
                for (int j = 1; j <= lastPlace; j++) {
                    if (numbers[j] > numbers[maxLoc])
                        maxLoc = j;
                }
                double tmp = numbers[lastPlace];
                numbers[lastPlace] = numbers[maxLoc];
                numbers[maxLoc] = tmp;
            }
            System.out.print("Sorted numbers are ");
            for (int i = 0; i < num_input; i++) {
                System.out.print(numbers[i] + " ");
            }

            System.out.println();
            System.out.println("Minimum: " + decfor.format(numbers[0]));
            System.out.println("Maximum: " + decfor.format(numbers[num_input - 1]));

            double sum = 0;
            double avg = 0;
            for (int i = 0; i < num_input; i++) {
                sum = sum + numbers[i];
                avg = sum / num_input;
            }
            System.out.println("Average: " + decfor.format(avg));

            if (num_input % 2 != 0) {
                double median = numbers[((num_input + 1) / 2) - 1];
                System.out.println("Median: " + decfor.format(median));
            } else if (num_input % 2 == 0) {
                int seq = (num_input + 1) / 2;
                double median = (numbers[seq - 1] + numbers[seq]) / 2;
                System.out.println("Median: " + decfor.format(median));
            }

            double sd = 0;
            double variance = 0;
            for (int i = 0; i < num_input; i++) {
                variance += Math.pow((numbers[i] - avg), 2) / (num_input);
                sd = Math.sqrt(variance);
            }
            System.out.println("Standard Deviation: " + decfor.format(sd));

        }

    }

}
