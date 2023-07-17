package se.lexicon;

/**
 * Excercises from the Udemy lecture with Tim Buchalka
 * Exercises 16 to 24
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(NumberPalindrome.isPalindrome(12321) ? "Yes" : "No"); //Ex. 16
        FirstLastDigitSum.sumFirstAndLastDigit(279); //Ex. 17
        SumEven.getEvenDigitSum(123456); //Ex. 18
        System.out.println(SharedDigit.hasSharedDigit(19, 99) ? "Yes" : "No"); //Ex. 19
        System.out.println(LastDigitChecker.hasSameLastDigit(41, 22, 71) ? "Yes" : "No"); //Ex. 20
        System.out.print(FactorPrinter.printFactors(10)); //Ex. 21
        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(12, 30)); //Ex. 22
        System.out.println(PerfectNumber.isPerfectNumber(6) ? "Yes" : "No"); //Ex. 23
        System.out.print("123 becomes "); //Ex. 24
        NumberToWords.numberToWords(123); //Ex. 24
        System.out.println("\n"); //Ex. 24
        SquareStar.printSquareStar(5);
        InputCalculator.inputThenPrintSumAndAverage();
    }
}
