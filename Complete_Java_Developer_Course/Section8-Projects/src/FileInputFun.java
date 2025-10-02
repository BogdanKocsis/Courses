import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileInputFun {
    public static void main(String[] args) {
        Scanner infile;
        int sum = 0;

        try {

            infile = new Scanner(new File("input.txt"));
            int input;

            while (infile.hasNextLine()) {
                input = infile.nextInt();
                System.out.println(input);
                sum += input;
            }
            infile.close();
            System.out.println("Sum is: " + sum);

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Input Mismatch");
        }
    }
}
