import java.util.Scanner;

public class KeyboardInput {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name;
        String city;
        int age;
        double salary;

        System.out.println("Enter your name: ");
        name = keyboard.nextLine();

        System.out.println("Enter your age: ");
        age = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("Enter your salary: ");
        salary = keyboard.nextDouble();
        keyboard.nextLine();
        salary *= 2;

        System.out.println("Enter your city: ");
        city = keyboard.nextLine();

        System.out.println("Hello, " + name);
        System.out.println("Your age is " + age);
        System.out.println("Your city is " + city);
        System.out.println("Your double salary is " + salary);
    }
}
