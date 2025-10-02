import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwiceData {
    public static void main(String[] args) {
        Scanner numbers;
        PrintWriter printWriter;

        try {

            numbers = new Scanner(new File("nums.txt"));
            printWriter = new PrintWriter("twice_nums.txt");

            while (numbers.hasNextLine()) {
                printWriter.println(2 * numbers.nextInt());
            }

            numbers.close();
            printWriter.close();

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
