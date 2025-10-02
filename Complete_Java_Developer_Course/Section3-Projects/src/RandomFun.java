import java.util.Random;

public class RandomFun {
    public static void main(String[] args) {
        Random random = new Random();
        int myRandomNumber;

        myRandomNumber = random.nextInt();
        System.out.println(myRandomNumber);

        myRandomNumber = random.nextInt(1000); //0 - 999
        System.out.println(myRandomNumber);

        //shifting
        myRandomNumber = random.nextInt(1000) + 1; //1 - 1000
        System.out.println(myRandomNumber);
    }
}
