

public class StringMethods2 {
    public static void main(String[] args) {
        String myName = "Bogdan Kocsis";

        String upper = myName.toUpperCase();
        String lower = myName.toLowerCase();

        int whereisB = myName.indexOf("B");

        String lastName = myName.substring(7);

        System.out.println("Upper: " + upper);
        System.out.println("Lower: " + lower);
        System.out.println("B is at index " + whereisB);
        System.out.println("Last Name: " + lastName);
    }
}
