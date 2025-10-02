

public class MethodsDemo {
    public static void main(String[] args) {
        printHello();
        printNumber(10);
        System.out.println(giveMe10());
        System.out.println(addThese(1, 2));
        System.out.println(square(5));
    }

    //void, parameterless method
    public static void printHello() {
        System.out.println("Hello World");
    }

    //void, parameterized
    public static void printNumber(int a) {
        System.out.println("The number is " + a);
    }

    //value-returning, parameterless
    public static int giveMe10() {
        return 10;
    }

    //value-returning, parameterized
    public static int addThese(int num1, int num2) {
        return num1 + num2;
    }

    public static double square(int num) {
        return num * num;
    }
}
