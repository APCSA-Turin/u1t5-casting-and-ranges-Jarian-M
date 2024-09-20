import java.util.Scanner;

public class TestAverageCalculator {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter the first test score: ");
        double test1 = scan.nextDouble();
        System.out.print("Please enter the second test score: ");
        double test2 = scan.nextDouble();
        System.out.print("Please enter the third test score: ");
        double test3 = scan.nextDouble();
        System.out.print("Please enter the fourth test score: ");
        double test4 = scan.nextDouble();

        double avgTestScore = (test1 + test2 + test3 + test4) / 4;
        System.out.println("The average is " + avgTestScore);
        int roundAvg = (int) (avgTestScore + .5);

        String passed;
        if (roundAvg >= 65) {
            passed = "passing";
        } else {
            passed = "NOT passing";
        }
        System.out.println("The rounded average is " + roundAvg + ", which is " + passed + ".");
        scan.close();
    }
}