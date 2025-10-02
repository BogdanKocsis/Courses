import java.util.Scanner;

public class Proj3_1_LearningPackages {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int choice;
        int sum = 0;
        System.out.println("Which of the packages do you want? 1,2 or 3?");
        choice = keyboard.nextInt();
        switch (choice) {
            case 1:
                System.out.println("How many courses did you enroll in this month");
                choice = keyboard.nextInt();
                if (choice > 2)
                    sum = 10 + (choice - 2) * 6;
                else sum = 10;
                break;
            case 2:
                System.out.println("How many courses did you enroll in this month");
                choice = keyboard.nextInt();
                if (choice > 4)
                    sum = 12 + (choice - 4) * 4;
                else sum = 12;
                break;
            case 3:
                System.out.println("How many courses did you enroll in this month");
                choice = keyboard.nextInt();
                if (choice > 6)
                    sum = 15 + (choice - 6) * 3;
                else sum = 15;
                break;
            default:
                System.out.println("Invalid choice");
        }
        System.out.println("Total cost is $" + sum);
    }
}
