package chapter3.item10;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaseInsensitiveStringTest {

    private String ANY_STRING;

    @Nested
    @DisplayName("if violate symmetry")
    class violateSymmetry {
        @Test
        @DisplayName("when we call equals of CaseInsensitiveString instance with String instance parameter, the method say that two instance is equal")
        public void test1() {
            ANY_STRING = "any string";
            CaseInsensitiveString caseInsensitiveString = new CaseInsensitiveString(ANY_STRING);
            String operand = ANY_STRING;

            assertTrue(caseInsensitiveString.equals(operand));
        }

        @Test
        @DisplayName("when we call eqauls of String instance with CaseInsensitive instance parameter, the method say that two instance is not equal")
        public void test2() {
            ANY_STRING = "any string";
            CaseInsensitiveString caseInsensitiveString = new CaseInsensitiveString(ANY_STRING);
            String operand = ANY_STRING;

            assertFalse(operand.equals(caseInsensitiveString));
        }
    }


}