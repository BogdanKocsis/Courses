import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class NamesAges {
    public static void main(String[] args) {
        Scanner namesFile;
        Scanner ageFile;
        PrintWriter printWriter;

        try {

            namesFile = new Scanner(new File("student_names.txt"));
            ageFile = new Scanner(new File("student_ages.txt"));
            printWriter = new PrintWriter("names_ages.txt");

            String name;
            int age;

            while (namesFile.hasNextLine()) {
                name = namesFile.nextLine();
                age = ageFile.nextInt();

                printWriter.println(name + " is " + age + " years old");
            }

            namesFile.close();
            ageFile.close();
            printWriter.close();

        } catch (FileNotFoundException e) {
            System.out.println(e.getCause());
        }
    }
}
