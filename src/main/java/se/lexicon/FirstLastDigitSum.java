package se.lexicon;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1; // Return -1 for negative numbers
        }

        String numberString = String.valueOf(number);
        int firstDigit = Character.getNumericValue(numberString.charAt(0));
        int lastDigit = Character.getNumericValue(numberString.charAt(numberString.length() - 1));
        System.out.println("The sum of " + firstDigit + " and " + lastDigit + " is " + (firstDigit+lastDigit));
        return firstDigit + lastDigit; // Return the sum of the first and last digits
    }
}
