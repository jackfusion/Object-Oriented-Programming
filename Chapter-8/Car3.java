/********************************************************
 * Car3.java - example from the book                    *
 *                                                      *
 * This class illustrates methods that can be chained.  *
 ********************************************************/

public class Car3 {
    private String make;
    private int year;

    //********************************************************

    public Car3 setMake(String make) {
        this.make = make;
        return this;
    }

    public Car3 setYear(int year) {
        this.year = year;
        return this;
    }

    //********************************************************

    public void printIt() {
        System.out.println(this.make + ", " + this.year);
    }
}
