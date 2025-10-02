import java.util.ArrayList;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal[] animals = new Animal[5];

        //Inheritance
//        Animal myAnimal = new Animal("Fred", 80);
//        Dog myDog = new Dog("Rover", 50);
//        Cat myCat = new Cat("Devil", 43);
//        Animal anotherAnimal = new Dog("Husky", 60);
//
//        System.out.println("Name: " + myAnimal.getName());
//        System.out.println("Weight: " + myAnimal.getWeight());
//        System.out.println("Animal says, " + myAnimal.makeNoise());
//
//        System.out.println("\nName: " + myDog.getName());
//        System.out.println("Weight: " + myDog.getWeight());
//        System.out.println("Doggy says, " + myDog.makeNoise());
//
//        System.out.println("\nName: " + myCat.getName());
//        System.out.println("Weight: " + myCat.getWeight());
//        System.out.println("Cat says, " + myCat.makeNoise());
//
//        System.out.println("\nName: " + anotherAnimal.getName());
//        System.out.println("Weight: " + anotherAnimal.getWeight());
//        System.out.println("Husky says, " + anotherAnimal.makeNoise());

        //Polymorphism
//        animals[0] = new Dog("Husky", 60);
//        animals[1] = new Cat("Siamese", 5);
//        animals[2] = new Dog("Beagle", 25);
//        animals[3] = new Cat("Persian", 7);
//        animals[4] = new Dog("Labrador", 30);
//        printAnimals(animals);

        //Abstract classes & Interfaces
        Dog myDog = new Dog("Bob", 150);
        Cat myCat = new Cat("Catty", 50);

        System.out.println(myDog.move());
        System.out.println(myCat.move());
    }

    public static void printAnimals(Animal[] animals) {
        for (Animal animal : animals) {
            System.out.println("Name: " + animal.getName());
            System.out.println(animal.getName() + " says: " + animal.makeNoise());
            System.out.println();
        }
    }
}
