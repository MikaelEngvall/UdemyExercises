package se.lexicon;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1; // Return -1 for invalid values
        }

        int divisor = Math.min(first, second);

        while (divisor > 0) {
            if (first % divisor == 0 && second % divisor == 0) {
                return divisor; // Return the divisor if it fully divides both numbers
            }
            divisor--;
        }

        return -1; // Return -1 if no common divisor is found
    }

}
