package chapter3.item13;

public class CloneableItem implements Cloneable{
    public int a;

    @Override
    public CloneableItem clone() {
        try {
            return (CloneableItem) super.clone();
        } catch (CloneNotSupportedException ex) {
            throw new AssertionError();
        }
    }

    public CloneableItem superClone() throws CloneNotSupportedException {
        return (CloneableItem) super.clone();
    }
}
