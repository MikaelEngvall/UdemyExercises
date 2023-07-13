package se.lexicon;

public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false; // Return false for numbers less than 1
        }

        int divisor = 1;
        int sum = 0;

        while (divisor < number) {
            if (number % divisor == 0) {
                sum += divisor;
            }
            divisor++;
        }

        return sum == number;
    }


}
