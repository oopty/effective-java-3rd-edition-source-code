package chapter3.item10;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class PhoneNumberTest {

    @Test
    void 반사성() {
        PhoneNumber pn = new PhoneNumber((short) 1, (short) 1, (short)1);
        assertThat(pn.equals(pn)).isTrue();
    }

    @Test
    void 대칭성() {
        PhoneNumber pn1 = new PhoneNumber((short) 1, (short) 1, (short)1);
        PhoneNumber pn2 = new PhoneNumber((short) 1, (short) 1, (short)1);
        assertThat(pn1.equals(pn2)).isTrue();
        assertThat(pn2.equals(pn1)).isTrue();
    }

    @Test
    void 추이성() {
        PhoneNumber pn1 = new PhoneNumber((short) 1, (short) 1, (short)1);
        PhoneNumber pn2 = new PhoneNumber((short) 1, (short) 1, (short)1);
        PhoneNumber pn3 = new PhoneNumber((short) 1, (short) 1, (short)1);
        assertThat(pn1.equals(pn2)).isTrue();
        assertThat(pn2.equals(pn3)).isTrue();
        assertThat(pn1.equals(pn3)).isTrue();
    }

    @Test
    void 일관성() {
        PhoneNumber pn1 = new PhoneNumber((short) 1, (short) 1, (short)1);
        PhoneNumber pn2 = new PhoneNumber((short) 1, (short) 1, (short)1);
        PhoneNumber pn3 = new PhoneNumber((short) 1, (short) 1, (short)1);
        assertThat(pn1.equals(pn2)).isTrue();
        assertThat(pn1.equals(pn2)).isTrue();
        assertThat(pn1.equals(pn2)).isTrue();
        assertThat(pn1.equals(pn2)).isTrue();
    }

    @Test
    void null은false() {
        PhoneNumber pn1 = new PhoneNumber((short) 1, (short) 1, (short)1);
        assertThat(pn1.equals(null)).isFalse();
    }
}
