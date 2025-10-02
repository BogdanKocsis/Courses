public class Dog extends Animal implements IMovable {
    public Dog(String name, double weight) {
        super(name, weight);
    }

    @Override
    public String makeNoise() {
        return "Woof!";
    }

    @Override
    public String move() {
        return "I'm wagging my tail and running!";
    }
}
