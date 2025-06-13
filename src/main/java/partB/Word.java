package partB;

public class Word {
    private final String value;

    public Word(String value) {
        this.value = value;
    }

    public int length() {
        return value.length();
    }

    public char firstChar() {
        return value.charAt(0);
    }

    public boolean startsWithConsonant() {
        char c = Character.toLowerCase(firstChar());
        return Character.isLetter(c) && !"aeiouаеёиоуыэюя".contains(String.valueOf(c));
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }
}


