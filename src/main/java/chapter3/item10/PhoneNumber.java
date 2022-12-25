package chapter3.item10;

import java.util.Objects;

/**
 * Best Practice
 */
public class PhoneNumber {
    private final short areaCode, prefix, lineNum;
    private int hashCode;

    public PhoneNumber(short areaCode, short prefix, short lineNum) {
        this.areaCode = areaCode;
        this.prefix = prefix;
        this.lineNum = lineNum;
    }

    private static short rangeCheck(int val, int max, String arg) {
        if(val < 0 || val > max) throw new IllegalArgumentException(arg + ": " + val);
        return (short) val;
    }

    @Override public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof PhoneNumber)) return false;
        PhoneNumber p = (PhoneNumber) o;
        return p.areaCode == areaCode && p.prefix == areaCode && p.lineNum == lineNum;
    }
}
