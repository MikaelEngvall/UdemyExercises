package se.lexicon;

public class NumberToWords {
    public static String numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }

        int reversedNumber = reverse(number);
        int digitCountDifference = getDigitCount(number) - getDigitCount(reversedNumber);

        while (reversedNumber > 0) {
            int digit = reversedNumber % 10;
            switch (digit) {
                case 0 -> System.out.print("Zero ");
                case 1 -> System.out.print("One ");
                case 2 -> System.out.print("Two ");
                case 3 -> System.out.print("Three ");
                case 4 -> System.out.print("Four ");
                case 5 -> System.out.print("Five ");
                case 6 -> System.out.print("Six ");
                case 7 -> System.out.print("Seven ");
                case 8 -> System.out.print("Eight ");
                case 9 -> System.out.print("Nine ");
            }
            reversedNumber /= 10;
        }

        for (int i = 0; i < digitCountDifference-1; i++) {
            System.out.print("Zero ");
        }
        return "\nDone";
    }

    public static int reverse(int number) {
        int reversedNumber = 0;
        int sign = 1;

        if (number < 0) {
            sign = -1;
            number *= -1;
        }

        while (number > 0) {
            int lastDigit = number % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            number /= 10;
        }

        return reversedNumber * sign;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }

        if (number == 0) {
            return 1;
        }

        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }
}
