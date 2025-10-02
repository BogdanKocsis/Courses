

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(getResult(2));
        System.out.println(getResult(2, 4));
        System.out.println(getResult(2, "9"));
        System.out.println(getResult("Bogdan", "Kocsis"));
    }

    public static int getResult(int num) {
        return num * 2;
    }

    public static int getResult(int num1, int num2) {
        return num1 * num2;
    }

    public static int getResult(int num1, String value) {
        return num1 * Integer.parseInt(value);
    }

    public static String getResult(String value1, String value2) {
        return value1 + " " + value2;
    }
}
