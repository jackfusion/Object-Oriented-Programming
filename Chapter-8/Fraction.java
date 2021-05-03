/********************************************
 * Fraction.java                            *
 *                                          *
 * This class stores and prints fractions.  *
 ********************************************/

public class Fraction {
    private int numerator;
    private int denominator;
    private double quotient; // numerator divided by denominator
    
    //****************************************

    public Fraction(int n) {
        this(n, 1);
    }
    
    //****************************************

    public Fraction(int n, int d) {
        this.numerator = n;
        this.denominator = d;
        this.quotient = (double) this.numerator / this.denominator;
    }

    //****************************************

    public void printIt() {
        System.out.println(this.numerator + " / " + this.denominator + " = " + this.quotient);
    }
}
