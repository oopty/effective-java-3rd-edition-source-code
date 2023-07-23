package chapter1.item5;

import java.util.Objects;

public class SpellCheck {
    private final Lexicon dictionary;
    public SpellCheck(Lexicon dictionary) {
        this.dictionary = Objects.requireNonNull(dictionary);
    }
}
