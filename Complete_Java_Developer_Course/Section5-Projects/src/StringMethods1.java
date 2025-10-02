

public class StringMethods1 {
    public static void main(String[] args) {
        String name = "Bogdan Kocsis";
        String name2 = "Bogdan Kocsis";
        String name3 = "David Alexandru";

        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i) + " ");
        }

        System.out.println();

        if (name.equals(name2)) {
            System.out.println("Names are equals");
        } else {
            System.out.println("Names are not equals");
        }

        if (name.compareTo(name3) > 0) {
            System.out.println("name > name3");
        } else {
            System.out.println("name <= name3");
        }

    }
}
