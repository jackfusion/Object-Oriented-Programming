/*************************************************
 * ArrayCopy.java - example from the book        *
 *                                               *
 * This copies an array and then alters the copy.*
 *************************************************/

public class ArrayCopy {
    public static void main(String[] args) {
        double[] pricesJanuary = { 1.29, 9.99, 22.50, 4.55, 7.35, 6.49 };
        double[] pricesFebruary = new double[pricesJanuary.length];

        for (int i=0; i<pricesJanuary.length; i++) {
            pricesFebruary[i] = pricesJanuary[i];
        }
        pricesFebruary[1] = 10.99;

        System.out.printf("%7s%7s\n", "Jan", "Feb");
        for (int i=0; i<pricesJanuary.length; i++) {
            System.out.printf("%7.2f%7.2f\n", pricesJanuary[i], pricesFebruary[i]);
        }
    }
}
