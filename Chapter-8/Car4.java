/****************************************************
 * Car4.java - example from the book                *
 *                                                  *
 * This Class stores and retrieves data for a car   *
*****************************************************/

public class Car4 {
    private String make; // car's make
    private int year; // car's manufacturing year
    private String color; // car's primary color

    //************************************************

    public Car4(String m, int y, String c) {
        this.make = m;
        this.year = y;
        this.color = c;
    }

    public String getMake()
    {
        return this.make;
    }
}
