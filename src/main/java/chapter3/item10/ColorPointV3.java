package chapter3.item10;

import java.awt.*;
import java.util.Objects;

public class ColorPointV3 {
    private final Color color;
    private final Point point;

    public ColorPointV3(int x, int y, Color color) {
        this.point = new Point(x, y);
        this.color = Objects.requireNonNull(color);
    }

    public Point asPoint() {
        return this.point;
    }

    @Override
    public boolean equals(Object o) { // 상속을 안함
        if(!(o instanceof ColorPointV3)) return false;

        ColorPointV3 colorPoint = (ColorPointV3) o;

        return this.color.equals(colorPoint.color) && point.equals(colorPoint.point);
    }
}
