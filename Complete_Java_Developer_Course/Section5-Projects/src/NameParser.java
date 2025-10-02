import java.util.Scanner;

public class NameParser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name: ");
        String name = input.nextLine();
        String firstName = name.substring(0, name.indexOf(" ")).toUpperCase();
        String lastName = name.substring(name.indexOf(" ") + 1).toLowerCase();

        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
    }
}
