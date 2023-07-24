package chapter1.item6;

import org.junit.jupiter.api.Test;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;


class RomanNumeralsTest {

    @Test
    void isRomanNumeralV1() {
        LocalDateTime start = LocalDateTime.now();
        for(int i = 0; i < 100; i++) {
            RomanNumerals.isRomanNumeralV1("123456789");
        }
        LocalDateTime end = LocalDateTime.now();

        System.out.printf("V1 duration: %d", start.until(end, ChronoUnit.MICROS));
    }
    @Test
    void isRomanNumeralV2() {
        LocalDateTime start = LocalDateTime.now();
        for(int i = 0; i < 100; i++) {
            RomanNumerals.isRomanNumeralV2("123456789");
        }
        LocalDateTime end = LocalDateTime.now();

        System.out.printf("V1 duration: %d", start.until(end, ChronoUnit.MICROS));
    }
}