package partB;
import java.util.ArrayList;
import java.util.List;

public class Sentence {
    private final List<Word> words;

    public Sentence(List<Word> words) {
        this.words = words;
    }

    public void removeWordsByLengthAndConsonant(int length) {
        words.removeIf(w -> w.length() == length && w.startsWithConsonant());
    }

    public List<Word> getWords() {
        return words;
    }

    public Sentence clone() {
        List<Word> copy = new ArrayList<>();
        for (Word w : words) {
            copy.add(new Word(w.getValue()));
        }
        return new Sentence(copy);
    }

    @Override
    public String toString() {
        List<String> strWords = new ArrayList<>();
        for (Word w : words) {
            strWords.add(w.getValue());
        }
        return String.join(" ", strWords);
    }
}

