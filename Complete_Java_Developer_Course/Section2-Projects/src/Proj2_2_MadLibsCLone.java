import java.util.Scanner;

public class Proj2_2_MadLibsCLone {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String firstAdjective, girlName, secondAdjective, occupation, place, clothe, hobby, thirdAdjective, secondOccupation, boyName, manName;

        System.out.print("Enter an adjective: ");
        firstAdjective = input.nextLine();

        System.out.print("Enter a girl's name: ");
        girlName = input.nextLine();

        System.out.print("Enter another adjective: ");
        secondAdjective = input.nextLine();

        System.out.print("Enter an occupation: ");
        occupation = input.nextLine();

        System.out.print("Enter the name of a place: ");
        place = input.nextLine();

        System.out.print("Enter the name of a piece of clothing: ");
        clothe = input.nextLine();

        System.out.print("Enter the name of a hobby: ");
        hobby = input.nextLine();

        System.out.print("Enter another adjective: ");
        thirdAdjective = input.nextLine();

        System.out.print("Enter another occupation: ");
        secondOccupation = input.nextLine();

        System.out.print("Enter a boy's name:");
        boyName = input.nextLine();

        System.out.print("Enter a man's name: ");
        manName = input.nextLine();

        System.out.print("There once was a " + firstAdjective + " girl named " + girlName + ", who was a "  + secondAdjective + " " + occupation + " in the Kingdom of " + place +
                ". She loved to wear " + clothe + " and to " + hobby + "." +
                " She wanted to marry the " + thirdAdjective + " " + secondOccupation +
                " named " + boyName + " but her father, King " + manName + " forbid her from seeing him." );

    }
}
