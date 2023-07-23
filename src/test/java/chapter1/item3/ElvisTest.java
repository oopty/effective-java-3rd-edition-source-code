package chapter1.item3;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ElvisTest {

    @Test
    void getSingletonInstanceV1() {
        ElvisV1 instance1 = ElvisV1.INSTANCE;
        ElvisV1 instance2 = ElvisV1.INSTANCE;


        Assertions.assertThat(instance1).isEqualTo(instance2);
    }

    @Test
    void getSingletonInstanceV2() {
        ElvisV2 instance1 = ElvisV2.getInstance();
        ElvisV2 instance2 = ElvisV2.getInstance();


        Assertions.assertThat(instance1).isEqualTo(instance2);
    }

    @Test
    void getSingletonInstanceV3() {
        ElvisV3 instance1 = ElvisV3.INSTANCE;
        ElvisV3 instance2 = ElvisV3.INSTANCE;


        Assertions.assertThat(instance1).isEqualTo(instance2);
    }
}