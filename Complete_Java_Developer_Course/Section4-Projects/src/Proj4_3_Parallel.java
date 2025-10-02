import java.util.ArrayList;
import java.util.Scanner;

public class Proj4_3_Parallel {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a name ");
            names.add(input.nextLine());
            System.out.println("Enter a age ");
            ages.add(input.nextInt());
            input.nextLine();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(names.get(i) + " is " + ages.get(i) + " years old");
        }
    }
}
