import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileOutputFun {
    public static void main(String[] args) {

        try {
            PrintWriter pw = new PrintWriter("output.txt");
            pw.println("Hello World");
            pw.println("My name is Bogdan Kocsis");
            pw.close();
        } catch (FileNotFoundException e) {
            System.out.println("Couldn't write to file");
        }
    }
}
