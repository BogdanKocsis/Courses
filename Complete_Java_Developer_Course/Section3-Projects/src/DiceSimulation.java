import java.util.Random;

public class DiceSimulation {
    public static void main(String[] args) {
        Random random = new Random(6);

        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt(6) + 1);
        }
    }
}
