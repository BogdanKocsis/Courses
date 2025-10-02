import java.util.Scanner;

public class Proj2_1_AverageOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double number1, number2, number3;
        double average;

        System.out.print("Enter three numbers: ");
        number1 = input.nextDouble();
        number2 = input.nextDouble();
        number3 = input.nextDouble();
        input.nextLine();

        average = (number1 + number2 + number3) / 3;
        System.out.println("The average is " + average);
    }
}
