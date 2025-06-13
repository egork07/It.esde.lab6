package partB;

import java.util.ArrayList;
import java.util.List;

public class Text {
    private final List<Sentence> sentences;

    public Text(List<Sentence> sentences) {
        this.sentences = sentences;
    }

    public void removeWordsByLengthAndConsonant(int length) {
        for (Sentence sentence : sentences) {
            sentence.removeWordsByLengthAndConsonant(length);
        }
    }

    public List<Word> getAllWords() {
        List<Word> all = new ArrayList<>();
        for (Sentence s : sentences) {
            all.addAll(s.getWords());
        }
        return all;
    }

    public Text clone() {
        List<Sentence> newSentences = new ArrayList<>();
        for (Sentence s : sentences) {
            newSentences.add(s.clone());
        }
        return new Text(newSentences);
    }

    @Override
    public String toString() {
        List<String> parts = new ArrayList<>();
        for (Sentence s : sentences) {
            parts.add(s.toString());
        }
        return String.join(". ", parts) + ".";
    }
}
