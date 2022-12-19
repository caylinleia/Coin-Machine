/**
 * @author Caylin Leia (Student ID: 261125917)
 */
public class CoinMachine {
    /**
     * This method will have both a cash and price input
     * and will calculate how much change is to be dispensed
     * as well as which coins to dispense, according to the required change
     */
    public static void main(String[] args) {

// Declare the three variables that are used to determine how much change is needed
        // Assume all amounts are integer amounts in cents and will be multiples of 5
        int cash = Integer.parseInt(args[0]); // Input the amount received here (assume Amount Received => Cost of the item)
        int price = Integer.parseInt(args[1]); // Input the cost of the item here
        int change = cash - price; // Demonstrates the required change

// Printing out a summary of what we have before calculation
        System.out.println("Amount Received: " + cash);
        System.out.println("Cost of the Item: " + price);
        System.out.println("Required Change: " + change + "\n");

// Declare variables to hold the denominations
        int toonies = 0;
        int loonies = 0;
        int quarters = 0;
        int dimes = 0;
        int nickels = 0;

// Declare the quantity of coins that can be fit into the change required
        toonies = change / 200;
        change = change % 200;

        loonies = change / 100;
        change = change % 100;

        quarters = change / 25;
        change = change % 25;

        dimes = change / 10;
        change = change % 10;

        nickels = change / 5;
        change = change % 5;

        // Printing how many and which coins to be dispensed based on the required change
        System.out.println("Change:");
        System.out.println("\ttoonies x " + toonies);
        System.out.println("\tloonies x " + loonies);
        System.out.println("\tquarters x " + quarters);
        System.out.println("\tdimes x " + dimes);
        System.out.println("\tnickels x " + nickels);

    }
}