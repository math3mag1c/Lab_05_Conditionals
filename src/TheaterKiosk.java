import java.util.Scanner;

public class TheaterKiosk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double age = 0;
        String invalidInput = "";
        System.out.println("How old are you?");
        if (input.hasNextDouble()) {
            age = input.nextDouble();
            if (age >= 21) {
                System.out.println("You get a wristband!");
            }
        }
        else {
            invalidInput = input.nextLine();
            System.out.println("Your input of " + invalidInput + " is not acceptable; try again.");
        }
    }
}
