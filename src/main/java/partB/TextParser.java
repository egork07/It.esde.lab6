package partB;

import java.util.ArrayList;
import java.util.List;

public class TextParser {
    public static Text parse(String raw) {
        raw = raw.replaceAll("\\t+", " ").replaceAll(" +", " ");
        String[] sentenceParts = raw.split("\\.\\s*");

        List<Sentence> sentences = new ArrayList<>();
        for (String s : sentenceParts) {
            if (s.isEmpty()) continue;
            String[] wordParts = s.trim().split("\\s+");

            List<Word> words = new ArrayList<>();
            for (String w : wordParts) {
                String clean = w.replaceAll("[^\\p{L}\\p{Nd}]", "");
                if (!clean.isEmpty()) {
                    words.add(new Word(clean));
                }
            }
            sentences.add(new Sentence(words));
        }

        return new Text(sentences);
    }
}
