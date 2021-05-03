/************************************************
 * CarDriver.java - example from the book       *
 *                                              *
 * This class demostrates copying an object.    *
 ************************************************/


public class CarDriver {
    public static void main(String[] args) {
        Car johnCar = new Car();
        Car stacyCar;

        johnCar.setMake("Honda");
        johnCar.setYear(2003);
        johnCar.setColor("silver");
        stacyCar = johnCar.makeCopy();
        stacyCar.setColor("peach");
        System.out.println("John's Car:");
        johnCar.display();
        System.out.println("Stacy's car:");
        stacyCar.display();
    }
}
