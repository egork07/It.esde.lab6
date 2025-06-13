package partB;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.TreeMap;
import java.util.ArrayList;

public class Main {

    // Задание 1 удалить слова длины зажаной, начинающиеся на согласную
    public static Text performTask1(Text text, int length) {
        Text copy = text.clone();
        copy.removeWordsByLengthAndConsonant(length);
        return copy;
    }

    // Задание 2 сортировать слова, начинающиеся на гласную, по первой согласной
    public static Map<Character, List<String>> performTask2(Text text) {
        Set<String> vowelWords = new TreeSet<>();
        for (Word word : text.getAllWords()) {
            if (startsWithVowel(word.getValue())) {
                vowelWords.add(word.getValue().toLowerCase());
            }
        }

        Map<Character, List<String>> result = new TreeMap<>();
        for (String word : vowelWords) {
            char key = firstConsonant(word);
            result.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }

        return result;
    }

    private static boolean startsWithVowel(String word) {
        if (word.isEmpty()) return false;
        char c = Character.toLowerCase(word.charAt(0));
        return "aeiouаеёиоуыэюя".indexOf(c) >= 0;
    }

    private static char firstConsonant(String word) {
        for (char c : word.toCharArray()) {
            char lc = Character.toLowerCase(c);
            if (Character.isLetter(lc) && !"aeiouаеёиоуыэюя".contains(String.valueOf(lc))) {
                return lc;
            }
        }
        return '_';
    }
}
