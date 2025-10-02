import java.util.ArrayList;

public class ArrayListFun {
    public static void main(String[] args) {
        ArrayList<String> namesList = new ArrayList<>();


        namesList.add("James");
        namesList.add("John");
        namesList.add("Wendy");
        namesList.add("Amanda");
        namesList.add("Robinson");
//
//        for (int i = 0; i < namesList.size(); i++) {
//            System.out.println(namesList.get(i));
//        }

        for (String name : namesList) {
            System.out.println(name);
        }
    }
}
