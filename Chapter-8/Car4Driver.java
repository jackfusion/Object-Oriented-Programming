/************************************************************
 * Car4Driver.java - example from the book                  *
 *                                                          *
 * This class is a demostration driver for the Car4 class.  *
 ************************************************************/

public class Car4Driver {
    public static void main(String[] args)
    {
        Car4 lanceCar = new Car4("Ford", 2011, "lime");
        Car4 azadehCar = new Car4("Volt", 2014, "red");

        System.out.println(lanceCar.getMake());
    }
}
