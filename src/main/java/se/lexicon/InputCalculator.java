package se.lexicon;

import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while (true) {
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                int number = scanner.nextInt();
                sum += number;
                count++;
            } else {
                break;
            }

            scanner.nextLine(); // Clear the input buffer
        }

        scanner.close();

        long average = count > 0 ? Math.round((double) sum / count) : 0;

        System.out.println("SUM = " + sum + " AVG = " + average);
    }
}