import java.util.Scanner;

public class BirthMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int birthMonth = 0;
        String invalidInput = "";
        System.out.println("Enter your birth month.");
        if (input.hasNextInt()) {
            birthMonth = input.nextInt();
            if (birthMonth > 0 && birthMonth <= 12) {
                System.out.println("Your birth month is " + birthMonth);
            }
            else {
                // this is for negative integers
                System.out.println("Your input was a negative integer or greater than 12; please try again.");
            }
        }
        else {
            // this is for everything that's not an integer like doubles or strings
            invalidInput = input.nextLine();
            System.out.println("Invalid input of " + invalidInput + ". Please try again.");
        }
    }
}
