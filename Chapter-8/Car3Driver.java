/********************************************************
 * Car3Driver.java - example from the book              *
 *                                                      *
 * This drives Car3 to illustrate method-call chaining. *
 ********************************************************/

public class Car3Driver {
    public static void main(String[] args) {
        Car3 car = new Car3();

        car.setMake("Honda").setYear(2012).printIt();
    }
}
