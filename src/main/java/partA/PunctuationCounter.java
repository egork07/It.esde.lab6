package partA;

public class PunctuationCounter {
    public static int countPunctuation(String text) {
        int count = 0;
        for (char ch : text.toCharArray()) {
            if (isPunctuation(ch)) {
                count++;
            }
        }
        return count;
    }

    private static boolean isPunctuation(char ch) {
        return ",.!?;:'\"-()[]{}".indexOf(ch) != -1;
    }
}