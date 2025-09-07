import java.util.Scanner;

public class PartyAffiliation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of the party. For example, enter D for Democratic, R for Republican, or I for Independent.");
        String partyName = input.nextLine();
        if (partyName.equals("D")) {
            System.out.println("You get a Democratic Donkey!");
        }
        else if (partyName.equals("R")) {
            System.out.println("You get a Republican Elephant!");
        }
        else if (partyName.equals("I")) {
            System.out.println("You get an Independent Human!");
        }
        else {
            System.out.println("You get an Other Party");
        }
    }
}
