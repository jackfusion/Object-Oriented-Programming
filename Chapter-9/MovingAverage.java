/********************************************************************************************************************************************
 * MovingAverage.java - example from the book                                                                                               *
 *                                                                                                                                          *
 * This program contains an operation that shifts each array element to the next lower element and loads a new input into the final element.*
 ********************************************************************************************************************************************/
import java.util.Scanner;

public class MovingAverage {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int[] days = { 9400, 9500, 9600, 9700 };
        double sum;
        int samples;

        System.out.print("Enter number of days to evaluate: ");
        samples = stdIn.nextInt();
        for (int j = 0; j < samples; j++) {
            //shift down and sum
            sum = 0.0;
            for (int d = 0; d < days.length - 1; d++) {
                days[d] = days[d + 1];
                sum += days[d];
            }
            System.out.print("Enter next day's valua: ");
            days[days.length - 1] = stdIn.nextInt();
            sum += days[days.length - 1];
            System.out.printf("Moving average = %5.0f\n", sum / days.length);
        }
    }
}
