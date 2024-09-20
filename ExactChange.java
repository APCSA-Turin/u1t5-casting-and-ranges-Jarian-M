import java.util.Scanner;
public class ExactChange {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter an amount in dollars and cents: ");
        double amount = scan.nextDouble();
        scan.nextLine();
        int amountInt = (int) (amount * 100);
        int minQuarters = (amountInt / 25);
        int amountMinusQ = (amountInt - minQuarters * 25);
        int minDimes = (amountMinusQ / 10);
        int amountMinusQD = (amountMinusQ - minDimes * 10);
        int minNickels = (amountMinusQD / 5);
        int amountMinusQDN = (amountMinusQD - minNickels * 5);
        int minPennies = (amountMinusQDN / 1);
        int minNumCoins = minQuarters + minDimes + minNickels + minPennies;
        System.out.println("The minimum number of coins is: " + minNumCoins);
        System.out.println(minQuarters + " quarters");
        System.out.println(minDimes + " dimes");
        System.out.println(minNickels + " nickels");
        System.out.println(minPennies + " pennies");
        scan.close(); 
    }
}