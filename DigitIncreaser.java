import java.util.Scanner;

public class DigitIncreaser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Type in a decimal between 100.00 and 999.99 with up to two decimals: ");
        double num = scan.nextDouble();
        scan.nextLine();

        int bigNum = (int) (num * 100);
        int hundreds = (int) (num / 100);
        int tens = (int) ((num / 10) % 10);
        int ones = (int) (num % 10);
        int numNoDecimal = ((int) num) * 100;
        int tenths = (int) ((bigNum - numNoDecimal) / 10);
        int hundredths = (int) ((bigNum - numNoDecimal) % 10);
        int newHundreds = hundreds + 1;
        int newTens = tens + 1;
        int newOnes = ones + 1;
        int newTenths = tenths + 1;
        int newHundredths = hundredths + 1;

        if (newHundreds > 9) {
            newHundreds = 0;
        }
        if (newTens > 9) {
            newTens = 0;
        }
        if (newOnes > 9) {
            newOnes = 0;
        }
        if (newTenths > 9) {
            newTenths = 0;
        }
        if (newHundredths > 9) {
            newHundredths = 0;
        }
        
        System.out.println("The adjusted number is " + newHundreds + newTens + newOnes + "." + newTenths + newHundredths);
        scan.close();
    }
}