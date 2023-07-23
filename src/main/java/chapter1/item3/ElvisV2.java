package chapter1.item3;

public class ElvisV2 {
    private static final ElvisV2 INSTANCE = new ElvisV2();

    public ElvisV2() {
    }

    public static ElvisV2 getInstance() {
        return INSTANCE;
    }
}
