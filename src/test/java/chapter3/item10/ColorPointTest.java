package chapter3.item10;

import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class ColorPointTest {
    @Test
    public void transitivityTest() {
        ColorPoint colorPoint1 = new ColorPoint(1, 2, Color.RED);
        Point p = new Point(1, 2);
        ColorPoint colorPoint2 = new ColorPoint(1, 2, Color.BLUE);

        assertTrue(colorPoint1.equals(p));
        assertTrue(p.equals(colorPoint2));
        assertFalse(colorPoint1.equals(colorPoint2));
    }
    @Test
    public void LSPTest() {
        Set<Point> set = Set.of(new Point(1, 2));
        ColorPointV2 colorPoint = new ColorPointV2(1, 2, Color.RED);
        assertFalse(set.contains(colorPoint));
    }

}