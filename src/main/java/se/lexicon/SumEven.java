package se.lexicon;

public class SumEven {
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1; // Return -1 for negative numbers
        }

        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                sum += digit;
            }
            number /= 10;
        }
        System.out.println("The sum of all even number is " + sum);
        return sum;
    }

}
