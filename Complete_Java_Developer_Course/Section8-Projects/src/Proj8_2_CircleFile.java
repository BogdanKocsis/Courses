import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Proj8_2_CircleFile {
    public static void main(String[] args) {

        ArrayList<Circle> circles = getCircle();
        printCircles(circles);
    }

    public static ArrayList<Circle> getCircle() {
        ArrayList<Circle> circles = new ArrayList<>();
        Scanner input;

        try {
            input = new Scanner(new File("circle_data.txt"));

            double radius;
            while (input.hasNextLine()) {
                radius = input.nextDouble();
                circles.add(new Circle(radius));
            }

            input.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return circles;
    }

    public static void printCircles(ArrayList<Circle> circles) {
        PrintWriter output;

        try {
            output = new PrintWriter("circle_output.txt");
            for (Circle circle : circles) {
                System.out.println("r = " + circle.getRadius());
                System.out.println("C = " + String.format("%.2f", circle.circumference()));
                System.out.println("A = " + String.format("%.2f", circle.area()));
                System.out.println();

                output.println("r = " + circle.getRadius());
                output.println("C = " + String.format("%.2f", circle.circumference()));
                output.println("A = " + String.format("%.2f", circle.area()));
                output.println();
            }
            output.close();

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}