package chapter1.item5;

import java.util.Objects;
import java.util.function.Supplier;

public class SpellCheckFactoryMethodPattern <E extends Lexicon> {
    private final E dictionary;
    public SpellCheckFactoryMethodPattern(Supplier<E> dictionaryFactory) {
        this.dictionary = Objects.requireNonNull(dictionaryFactory.get());
    }

    public E getDictionary() {
        return dictionary;
    }
}
