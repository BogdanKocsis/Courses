

public class HouseDemo {

    public static void main(String[] args) {
        House myHouse = new House();
        House yourHouse = new House(3, 10, "blue");

        myHouse.setNumStories(2);
        myHouse.setNumWindows(6);
        myHouse.setColor("red");

//        yourHouse.setNumStories(3);
//        yourHouse.setNumWindows(10);
//        yourHouse.setColor("blue");

        printHouseData(myHouse);
        printHouseData(yourHouse);
    }

    public static void printHouseData(House house) {
        System.out.println("The house is " + house.getColor() + " and has " + house.getNumStories() + " stories and " + house.getNumWindows() + " windows.");

    }
}
