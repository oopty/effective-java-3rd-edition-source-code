package chapter1.item5;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpellCheckFactoryMethodPatternTest {

    @Test
    void factoryMethodPattern_getDictionary() {
        SpellCheckFactoryMethodPattern<Lexicon> spellCheck = new SpellCheckFactoryMethodPattern<>(Lexicon::getInstance);
        Lexicon dictionary = spellCheck.getDictionary();
        Assertions.assertThat(dictionary).isNotNull();
    }
}