import java.util.ArrayList;

public class Proj6_1_SumOfElements {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println("Sum is: " + sumOfElements(list));
    }

    public static int sumOfElements(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer number : arr) {
            sum += number;
        }
        return sum;
    }
}
