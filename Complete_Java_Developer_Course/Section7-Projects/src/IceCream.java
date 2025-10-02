import java.util.ArrayList;

public class IceCream {
    private String name;
    private int cost;
    private int numScoops;
    private ArrayList<String> toppings;

    public IceCream(String name, int cost, int numScoops) {
        this.name = name;
        this.cost = cost;
        this.numScoops = numScoops;
        this.toppings = new ArrayList<>();
    }

    public void addTopping(String topping) {
        if (!toppings.contains(topping)) {
            toppings.add(topping);
        } else {
            System.out.println("Topping already exists!");
        }

    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public int getNumScoops() {
        return numScoops;
    }

    public void printToppings() {
        if (!toppings.isEmpty()) {
            System.out.println("Toppings: ");
            for (String topping : toppings) {
                System.out.println("\t" + topping);
            }
        } else {
            System.out.println("No toppings exists!");
        }
    }
}
