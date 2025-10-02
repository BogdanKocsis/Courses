

public class IceCreamDemo {
    public static void main(String[] args) {

        IceCream firstIceCream = new IceCream("Chocolate", 3, 2);
        IceCream secondIceCream = new IceCream("Strawberry", 2, 1);

        firstIceCream.addTopping("nuts");
        firstIceCream.addTopping("cherries");

        secondIceCream.addTopping("sprinkles");

        printIceCream(firstIceCream);
        printIceCream(secondIceCream);

    }

    public static void printIceCream(IceCream iceCream) {
        System.out.println(iceCream.getName());
        System.out.println("Cost: $" + iceCream.getCost());
        System.out.println("Topped with: ");
        iceCream.printToppings();
        System.out.println();
    }
}
