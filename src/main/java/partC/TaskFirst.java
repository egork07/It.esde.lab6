package partC;

import java.util.*;

public class TaskFirst {
    private static final Map<Character, Character> letterToDigit = new HashMap<>();

    static {
        letterToDigit.put('A', '2'); letterToDigit.put('B', '2'); letterToDigit.put('C', '2');
        letterToDigit.put('D', '3'); letterToDigit.put('E', '3'); letterToDigit.put('F', '3');
        letterToDigit.put('G', '4'); letterToDigit.put('H', '4'); letterToDigit.put('I', '4');
        letterToDigit.put('J', '5'); letterToDigit.put('K', '5'); letterToDigit.put('L', '5');
        letterToDigit.put('M', '6'); letterToDigit.put('N', '6'); letterToDigit.put('O', '6');
        letterToDigit.put('P', '7'); letterToDigit.put('Q', '7'); letterToDigit.put('R', '7'); letterToDigit.put('S', '7');
        letterToDigit.put('T', '8'); letterToDigit.put('U', '8'); letterToDigit.put('V', '8');
        letterToDigit.put('W', '9'); letterToDigit.put('X', '9'); letterToDigit.put('Y', '9'); letterToDigit.put('Z', '9');
    }

    public static String encodeWord(String word) {
        StringBuilder sb = new StringBuilder();
        for (char c : word.toUpperCase().toCharArray()) {
            sb.append(letterToDigit.get(c));
        }
        return sb.toString();
    }

    public static String findLongestMatch(String phoneNumber, String[] dictionary) {
        String longestMatch = "";
        int maxLen = 0;

        for (String word : dictionary) {
            String digitCode = encodeWord(word);
            if (phoneNumber.contains(digitCode) && digitCode.length() > maxLen) {
                maxLen = digitCode.length();
                longestMatch = word;
            }
        }
        return longestMatch;
    }

}
