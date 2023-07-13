package se.lexicon;
public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int reversedNumber = 0;
        int originalNumber = number;

        // Reverse the number
        while (number != 0) {
            int lastDigit = number % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            number /= 10;
        }

        // Check if the reversed number is equal to the original number
        return originalNumber == reversedNumber;
    }
}

