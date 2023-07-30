package chapter3.item10;

import java.awt.*;
import java.util.Objects;

public class ColorPointV2 extends Point{
    private final Color color;

    public ColorPointV2(int x, int y, Color color) {
        super(x, y);
        this.color = Objects.requireNonNull(color);
    }

    @Override
    public boolean equals(Object o) { // Point랑 비교 못하게 아예 막아버림, LSP 위배
        if(o == null | o.getClass() != getClass()) return false;
        return color.equals(((ColorPointV2) o).color) && super.equals(o);
    }
}
