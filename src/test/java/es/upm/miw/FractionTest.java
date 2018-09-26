package es.upm.miw;

import org.apache.logging.log4j.LogManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FractionTest {

    private Fraction fraction;

    @BeforeEach
    void before() {
        fraction = new Fraction(1, 4);
    }

    @Test
    void testConstructor() {
        assertEquals(1, new Fraction().decimal());
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

    @Test
    void testMultiplicar() {
        Assertions.assertEquals(new Fraction(8, 48).getNumerator(), fraction.multiplicar(new Fraction(8, 12)).getNumerator());
        Assertions.assertEquals(new Fraction(8, 48).getDenominator(), fraction.multiplicar(new Fraction(8, 12)).getDenominator());
    }

    @Test
    void testMultiplicarArithmeticExceptionIfDivisionCero() {
        ArithmeticException exception = Assertions.assertThrows(ArithmeticException.class, () -> fraction.multiplicar(new Fraction(8, 0)));
        LogManager.getLogger(this.getClass()).debug(exception.getMessage());
    }

    @Test
    void testEsEquivalente() {
        assertEquals(false, fraction.isEquivalent(12,4));
        assertEquals(true, fraction.isEquivalent(3,12));
    }
}
