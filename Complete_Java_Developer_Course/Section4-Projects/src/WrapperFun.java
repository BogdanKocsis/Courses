import java.util.ArrayList;

public class WrapperFun {
    public static void main(String[] args) {
        ArrayList<Integer> myArray = new ArrayList<>();

        myArray.add(1);
        myArray.add(2);

        for (int i : myArray) {
            System.out.println(i);
        }

        String someValue = "450";
        int numericValue = Integer.parseInt(someValue);
        numericValue += 10;

        System.out.println(numericValue);

        String pi = "3.14159";
        double numericPi = Double.parseDouble(pi);
        System.out.println(numericPi);
    }
}
