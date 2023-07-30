package chapter3.item13;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

class CloneableItemTest {

    @Test
    public void cloneTest() {
        CloneableItem cloneableItem = new CloneableItem();

        cloneableItem.setA(3);

        cloneableItem.clone();
        assertTrue(cloneableItem.a == 3);
    }
}