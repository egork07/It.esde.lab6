package partC;

import java.util.*;

public class Task_1 {
    // Телефонная раскладка
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

    public static void main(String[] args) {
        String phoneNumber = "4355696753";
        String[] dictionary = {"HELLO", "WORLD", "JAVA", "CODE", "KOD", "LOL"};

        // Преобразуем слова в цифровой вид
        Map<String, String> encodedWords = new HashMap<>();
        for (String word : dictionary) {
            encodedWords.put(word, encodeWord(word));
        }

        String longestMatch = "";
        int maxLen = 0;

        for (Map.Entry<String, String> entry : encodedWords.entrySet()) {
            String word = entry.getKey();
            String digitCode = entry.getValue();

            if (phoneNumber.contains(digitCode) && digitCode.length() > maxLen) {
                maxLen = digitCode.length();
                longestMatch = word;
            }
        }

        if (!longestMatch.isEmpty()) {
            System.out.println("Самая длинная подстрока: " + longestMatch);
        } else {
            System.out.println("Совпадений не найдено.");
        }
    }

    // Кодирование слова в цифровую форму
    public static String encodeWord(String word) {
        StringBuilder sb = new StringBuilder();
        for (char c : word.toUpperCase().toCharArray()) {
            sb.append(letterToDigit.get(c));
        }
        return sb.toString();
    }
}
