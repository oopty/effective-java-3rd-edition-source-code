package chapter3.item14;

import chapter3.item11.PhoneNumber;

import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparingInt;

public class ComparableItem implements Comparable<ComparableItem>{

    private final short areaCode, prefix, lineNum;

    private final static Comparator<ComparableItem> COMPARATOR = comparingInt((ComparableItem item) -> item.areaCode)
            .thenComparing(item -> item.prefix)
            .thenComparing(item -> item.lineNum);

    public ComparableItem(short areaCode, short prefix, short lineNum) {
        this.areaCode = areaCode;
        this.prefix = prefix;
        this.lineNum = lineNum;
    }

    @Override
    public int compareTo(ComparableItem o) {
//        int result = Short.compare(areaCode, o.areaCode);
//        if(result == 0) {
//            result = Short.compare(prefix, o.prefix);
//            if(result == 0) {
//                result = Short.compare(lineNum, o.lineNum);
//            }
//        }
//        return result;

        return COMPARATOR.compare(this, o);
    }
}
