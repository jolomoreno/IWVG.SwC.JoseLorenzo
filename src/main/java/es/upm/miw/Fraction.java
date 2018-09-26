package es.upm.miw;

public class Fraction {

    private int numerator;

    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {
        this(1, 1);
    }

    public double decimal() {
        return (double) numerator / denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }


    public boolean isPropia() {
        return this.numerator < this.denominator;
    }

    public boolean isImpropia() {
        return !this.isPropia();
    }

    public Fraction multiplicar(Fraction multiplicando) throws ArithmeticException{
        assert multiplicando != null;
        if (Integer.compare(0, multiplicando.getDenominator()) == 0 || Integer.compare(0, this.getDenominator()) == 0) {
            throw new ArithmeticException("An integer divide by zero");
        } else {
            int newNumerator = this.getNumerator() * multiplicando.getNumerator();
            int newDenominator = this.getDenominator() * multiplicando.getDenominator();
            return new Fraction(newNumerator, newDenominator);
        }
    }

    public boolean isEquivalent(int parametro_nume, int parametro_denom){
        boolean resultado = this.numerator * parametro_denom == this.denominator * parametro_nume;
        return resultado;
    }

}
