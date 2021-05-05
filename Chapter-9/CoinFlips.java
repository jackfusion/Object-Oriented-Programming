/********************************************
 * CoinFlips.java - example from the book   *
 *                                          *
 * This generates a histogram of coin flips.*
 ********************************************/

public class CoinFlips {
    public static void main(String[] args) {
        final int NUM_OF_COINS = 3; // number os coins
        final int NUM_OF_REPS = 1000000; // repetitions
        
        // The frequency array holds the number of times a particular number of heads occured.
        int[] frequency = new int[NUM_OF_COINS + 1];
        int heads; //heads in current group of flips
        double fractionOfReps; // head count / repetitions
        int numOfAsterisks; // asterisks in one histogram bar

        for (int rep = 0; rep < NUM_OF_REPS; rep++) {
            // perform a group of flips
            heads = 0;
            for (int i = 0; i < NUM_OF_COINS; i++) {
                heads += (int) (Math.random() * 2);
            }
            frequency[heads]++; // update appropriate bin
        }
        System.out.println("Number of times each head count occured:");
        for (heads=0; heads<=NUM_OF_COINS; heads++){
            System.out.print(" " + heads + " " + frequency[heads] + " ");
            fractionOfReps = (float) frequency[heads] / NUM_OF_REPS;
            numOfAsterisks = (int) Math.round(fractionOfReps * 100);

            for (int i = 0; i < numOfAsterisks; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
