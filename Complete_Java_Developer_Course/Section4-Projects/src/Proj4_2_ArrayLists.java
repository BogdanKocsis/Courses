import java.util.ArrayList;
import java.util.Scanner;

public class Proj4_2_ArrayLists {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Double> numbers = new ArrayList<>();
        System.out.print("Enter a number ");
        double number = input.nextDouble();

        while (number >= 0) {
            numbers.add(number);
            System.out.print("Enter an integer: ");
            number = input.nextDouble();
        }

        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.print(numbers.get(i) + " ");
        }
    }
}
