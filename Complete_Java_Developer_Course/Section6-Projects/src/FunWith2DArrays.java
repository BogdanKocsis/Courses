import java.util.Random;

public class FunWith2DArrays {
    public static void main(String[] args) {
        int[][] my2DArray = new int[2][3];
        fill2DArray(my2DArray);
        print2DArray(my2DArray);
        twice2DArray(my2DArray);
        print2DArray(my2DArray);
    }

    public static void fill2DArray(int[][] arr) {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rand.nextInt(100);
            }
        }
    }

    public static void twice2DArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] *= 2;
            }
        }
    }

    public static void print2DArray(int[][] twoArr) {
        for (int[] arr : twoArr) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
