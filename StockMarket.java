import java.util.Scanner;

public class StockMarket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a stock ticker symbol: ");
        String stock = scan.nextLine();
        System.out.print("How many shares do you own? ");
        int stocks = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter the change of stock price as a negative or positive decimal: ");
        double price = scan.nextDouble();
        scan.nextLine();

        int change;
        if (price < 0) {
            change = (int) (stocks * price - 0.5);
        } else {
            change = (int) (stocks * price + 0.5);
        }
        
        System.out.println("Change in stock value of " + stock + ": $" + change + " dollars");

        scan.close();
    }
}