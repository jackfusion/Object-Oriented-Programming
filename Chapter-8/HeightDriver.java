/****************************************************************
 * HeightDriver.java - example from the book                    *
 *                                                              *
 * This class is a demonstration driver for the Height class.   *
 ****************************************************************/

public class HeightDriver {
    public static void main(String[] args) {
        Height myHeight = new Height();

        myHeight.setHeight(72, "in");
        myHeight.print();
        myHeight.setHeight(180.0);
        myHeight.print();
    }
}
