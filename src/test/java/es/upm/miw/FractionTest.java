package es.upm.miw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FractionTest {

    private Fraction fraction;

    @BeforeEach
    void before() {
        fraction = new Fraction(1, 4);
    }

    @Test
    void testDecimal() {
        assertEquals(0.25, fraction.decimal(), 10e-3);
    }

    @Test
    void testGetNumerator() {
        assertEquals(1, fraction.getNumerator());
    }

    @Test
    void testGetDenominator() {
        assertEquals(4, fraction.getDenominator());
    }
    @Test
    void testEsEquivalente() {
        assertEquals(false, fraction.isEquivalent(12,4));
        assertEquals(true, fraction.isEquivalent(3,12));
    }
}
