import java.util.ArrayList;
import java.util.Scanner;

public class Proj5_1_NamePermutations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> firstNames = new ArrayList<>();
        ArrayList<String> lastNames = new ArrayList<>();
        final int NUM_NAMES = 5;

        for (int i = 0; i < NUM_NAMES; i++) {
            System.out.println("Enter Name: ");
            String name = input.nextLine();
            firstNames.add(name.substring(0, name.indexOf(" ")));
            lastNames.add(name.substring(name.indexOf(" ") + 1));
        }

        for (String firstName : firstNames) {
            for (String lastName : lastNames) {
                System.out.println(firstName + " " + lastName);
            }
        }
    }
}
