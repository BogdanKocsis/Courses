import java.util.Scanner;

public class Proj4_1_Arrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter number: ");
            numbers[i] = input.nextByte();
        }

        for (int number : numbers) {
            System.out.println(number * 2);
        }
    }
}
