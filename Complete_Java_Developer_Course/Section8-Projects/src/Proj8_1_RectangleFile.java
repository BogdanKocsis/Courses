import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Proj8_1_RectangleFile {
    public static void main(String[] args) {

        ArrayList<Rectangle> rectangles = getRectangles();
        printRectangles(rectangles);

    }

    public static ArrayList<Rectangle> getRectangles() {
        ArrayList<Rectangle> rectangles = new ArrayList<>();
        Scanner input;

        try {
            input = new Scanner(new File("rectangle_data.txt"));
            String line;
            double length, width;
            while (input.hasNext()) {
                length = input.nextDouble();
                width = input.nextDouble();
                rectangles.add(new Rectangle(length, width));
            }
            input.close();
            return rectangles;

        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
            System.out.println(e.getMessage());
        }
        return rectangles;
    }

    public static void printRectangles(ArrayList<Rectangle> rectangles) {
        for (Rectangle rectangle : rectangles) {
            System.out.println("Length: " + rectangle.getLength() + " Width: " + rectangle.getWidth());
            System.out.println("Area: " + rectangle.area());
            System.out.println("Perimeter: " + rectangle.perimeter());
            System.out.println();
        }
    }

}
