package chapter3.item10;

import java.awt.*;
import java.util.Objects;

public class ColorPoint extends Point{
    private final Color color;

    public ColorPoint(int x, int y, Color color) {
        super(x, y);
        this.color = Objects.requireNonNull(color);
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Point)) return false;
        if(!(o instanceof ColorPoint)) return super.equals(o);
        return color.equals(((ColorPoint) o).color) && super.equals(o);
    }
}
