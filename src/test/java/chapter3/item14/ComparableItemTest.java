package chapter3.item14;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ComparableItemTest {

    @Test
    void testComparableItem() {
        ComparableItem comparableItem1 = new ComparableItem((short) 1, (short) 1, (short) 1);
        ComparableItem comparableItem2 = new ComparableItem((short) 2, (short) 1, (short) 1);

        Assertions.assertThat(comparableItem1.compareTo(comparableItem2)).isEqualTo(-1);
    }
}
