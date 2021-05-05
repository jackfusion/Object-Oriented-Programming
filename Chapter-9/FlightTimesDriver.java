/****************************************************
 * FlightTimesDriver.java - example from the book   *
 *                                                  *
 * This manages a table of intercity flight times.  *
 ****************************************************/

public class FlightTimesDriver {
    public static void main(String[] args) {
        int[][] flightTimes =
        {
            {0, 22, 30, 42, 55},
            {23, 0, 9, 25, 37},
            {31, 10, 0, 11, 28},
            {44, 27, 12, 0, 12},
            {59, 41, 30, 14, 0}
                };
        String[] cities = { "Wch", "Top", "KC", "Col", "StL" };
        FlightTimes ft = new FlightTimes(flightTimes, cities);

        System.out.println("\nFlight times for KansMo Arelines:\n");
        ft.displayFlightTimesTable();
        System.out.println();
        ft.promptForFlightTime();
    }
}
