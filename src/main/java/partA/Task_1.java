package partA;

public class Task_1 {
    public static void findTextWord(String[] args) {
        String text = "Hello ";
        int k = 5;
        String insert = " World";

        String result = text.substring(0, k) + insert + text.substring(k);
        System.out.println(result);
    }

    public static String insertAt(String text, int k, String insert) {
        return text.substring(0, k) + insert + text.substring(k);
    }
}