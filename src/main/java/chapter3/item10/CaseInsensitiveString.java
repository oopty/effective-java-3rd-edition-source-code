package chapter3.item10;

import java.util.Objects;

/**
 * 10-1
 */
public class CaseInsensitiveString {
    private final String s;

    public CaseInsensitiveString(String s) {
        this.s = Objects.requireNonNull(s);
    }

    @Override
    public boolean equals(Object o) { // 대칭성 위배
        if (o instanceof CaseInsensitiveString)
            return s.equalsIgnoreCase(
                    ((CaseInsensitiveString) o).s
            );
        if(o instanceof String)
            return s.equalsIgnoreCase((String) o);
        return false;
    }
}
