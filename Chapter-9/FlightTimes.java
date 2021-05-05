/****************************************************
 * FlightTimes.java - example from the book         *
 *                                                  *
 * This manages a table of intercity flights times. *
 ****************************************************/
import java.util.Scanner;

public class FlightTimes {
    private int[][] flightTimes; // table of flights times
    private String[] cities; // cities in flightTimes table
    
    //*************************************************************

    public FlightTimes(int[][] ft, String[] c) {
        flightTimes = ft;
        cities = c;
    }

    //**************************************************************

    public void promptForFlightTime()
    {
        Scanner stdIn = new Scanner(System.in);
        int departure; // index for departure city
        int destination; // index for destination city

        for (int i = 0; i < cities.length; i++) {
            System.out.println(i + 1 + " = " + cities[i]);
        }
        System.out.print("Enter department city's number: ");
        departure = stdIn.nextInt() - 1;
        System.out.print("Enter destination city's number: ");
        destination = stdIn.nextInt() - 1;
        System.out.println("Flight time = " + flightTimes[departure][destination] + " minutes.");
    }

    //****************************************************************

    // This method prints a table of all flight times.

    public void displayFlightTimesTable()
    {
        final String CITY_FMT_STR = "%5s";
        final String TIME_FMT_STR = "%5d";

        System.out.printf(CITY_FMT_STR, ""); // empty top-left corner
        for (int col = 0; col < cities.length; col++) {
            System.out.printf(CITY_FMT_STR, cities[col]);
        }
        System.out.println();

        for (int row = 0; row < flightTimes.length; row++) {
            System.out.printf(CITY_FMT_STR, cities[row]);
            for (int col=0; col<flightTimes[0].length; col++)
            {
                System.out.printf(TIME_FMT_STR, flightTimes[row][col]);
            }
            System.out.println();
        }
    }
}
