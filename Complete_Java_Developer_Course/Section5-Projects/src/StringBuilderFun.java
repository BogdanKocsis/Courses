

public class StringBuilderFun {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Bogdan Kocsis");

        stringBuilder.append(" is awesome");
        System.out.println(stringBuilder);

        stringBuilder.insert(7, "Andrei ");
        System.out.println(stringBuilder);

        stringBuilder.replace(24, 31, "amazing");
        System.out.println(stringBuilder);

        stringBuilder.delete(6, 13);
        System.out.println(stringBuilder);

        stringBuilder.replace(0, 6, "Dr.");
        System.out.println(stringBuilder);
    }
}
