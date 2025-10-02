

public class MoreArrayFun {
    public static void main(String[] args) {
        int[] myArray = new int[10];

        for (int i = 0; i < 10; i++) {
            myArray[i] = i + 1;
        }

        for (int i : myArray) {
            System.out.println(i);
        }
    }
}
