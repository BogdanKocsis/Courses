import java.util.Scanner;

public class Proj3_2_DivisibleByThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your integer: ");
        int integer = input.nextInt();

        if (integer % 3 == 0) {
            System.out.println(integer + " is divisible by 3");
        } else {
            System.out.println(integer + " is NOT divisible by 3");
        }
    }
}
