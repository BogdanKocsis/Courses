import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class WriteNames {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Bogdan");
        names.add("Andrei");
        names.add("David");
        names.add("Stefan");
        names.add("Alex");
        names.add("Ioana");

        try {
            PrintWriter pw = new PrintWriter("names.txt");

            for (String name : names) {
                pw.println(name);
            }
            pw.close();

        } catch (FileNotFoundException e) {
            System.out.println("Couldn't write to file");
        }
    }
}
