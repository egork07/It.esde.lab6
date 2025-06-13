package partA;

public class Concatenater {
    public static void demonstrateInsertion(String[] args) {
        String text = "Hello ";
        int position = 5;
        String insert = " World";

        String result = text.substring(0, position) + insert + text.substring(position);
        System.out.println(result);
    }

    public static String insertAt(String text, int k, String insert) {
        return text.substring(0, k) + insert + text.substring(k);
    }
}