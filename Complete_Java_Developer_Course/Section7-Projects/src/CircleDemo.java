

public class CircleDemo {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(5.0);
        Circle c3 = new Circle(12.75);

        printCircle(c1);
        printCircle(c2);
        printCircle(c3);
    }

    public static void printCircle(Circle circle) {

        System.out.printf("r = %.2f\n", circle.area());
        System.out.printf("C = %.2f\n", circle.circumference());
        System.out.printf("A = %.2f\n", circle.area());
        System.out.println();
//        System.out.println("r = " + circle.getRadius());
//        System.out.println("C = " + String.format("%.2f", circle.circumference()));
//        System.out.println("A = " + String.format("%.2f", circle.area()));
    }
}
