

public class RelationalFun {
    public static void main(String[] args) {
        boolean myBoolean = true;
        boolean yourBoolean = false;
        int myAge = 36;
        int yourAge = 29;
        int andreisAge = 31;
        int currentAge = 26;

        String myName = "Bogdan";
        String yourName = "Bogdanel";

        System.out.println("myBool is " + myBoolean);
        System.out.println("yourBool is " + yourBoolean);

        //relational operations
        boolean ageComparison = myAge > yourAge;

        System.out.println("myAge > yourAge?: " + ageComparison);

        ageComparison = yourAge > andreisAge;
        System.out.println("yourAge > andreisAge?: " + ageComparison);

        ageComparison = yourAge == andreisAge;
        System.out.println("yourAge == andreisAge?: " + ageComparison);

        boolean nameComparison = myName.equals(yourName);
        System.out.println("does name match? " + nameComparison);

        System.out.println("current age >= 21?: " + (currentAge >= 21));
    }
}
