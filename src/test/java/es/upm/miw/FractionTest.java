package es.upm.miw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
    void testIsPropia() {
        assertTrue(new Fraction(1, 2).isPropia());
    }

    @Test
    void testIsImpropia() {
        assertTrue(new Fraction(5, 2).isImpropia());
    }
}
