import java.util.Scanner;

public class Fraternity {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int age;
        char gender;

        System.out.println("Enter your gender: ");
        gender = input.next().charAt(0);

        System.out.println("Enter your age: ");
        age = input.nextInt();

        if ((gender == 'M' || gender == 'm') && age >= 19) {
            System.out.println("You're eligible to join Fraternity!");
        } else {
            System.out.println("You're not eligible to join Fraternity!");
        }
    }
}
