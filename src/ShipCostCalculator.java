import java.util.Scanner;

public class ShipCostCalculator {
    static public void  main(String args[]) {
        Scanner input = new Scanner(System.in);
        double itemCost = 0;
        double shippingCost = 0;
        boolean validInput = true;
        String invalidInput = "";
        System.out.println("Enter the total cost of your items");
        if (input.hasNextDouble()) {
            itemCost = input.nextDouble();
            if (itemCost < 100 && itemCost >= 0){
                shippingCost = 0.02 * itemCost;
            }
            else if (itemCost < 0) {
                // this is for item costs that are negative which simply isn't possible
                System.out.println("Your input was negative; try again to input a valid shipping cost");
                validInput = false;
            }
        }
        else {
            // this is for some sort of input that's not a double (like a word or an integer)
            invalidInput = input.nextLine();
            System.out.println("Invalid input; try again to input a valid shipping cost.");
            validInput = false;
        }
        if (validInput) {
            System.out.println("Your shipping cost is " + shippingCost + ".");
            System.out.println("Your total cost is " + (shippingCost + itemCost) + ".");
        }
    }
}
