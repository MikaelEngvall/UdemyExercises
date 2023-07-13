package se.lexicon;

public class SharedDigit {
    public static boolean hasSharedDigit(int number1, int number2) {
        if (!isValidRange(number1) || !isValidRange(number2)) {
            return false; // Return false if either number is not within the range
        }

        int digit1;
        int digit2;

        while (number1 > 0) {
            digit1 = number1 % 10;

            int tempNumber2 = number2;
            while (tempNumber2 > 0) {
                digit2 = tempNumber2 % 10;

                if (digit1 == digit2) {
                    return true; // Return true if a shared digit is found
                }

                tempNumber2 /= 10;
            }

            number1 /= 10;
        }

        return false; // Return false if no shared digit is found
    }

    public static boolean isValidRange(int number) {
        return number >= 10 && number <= 99; // Check if number is within the range
    }

}
