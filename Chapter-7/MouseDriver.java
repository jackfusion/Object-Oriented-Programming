/********************************************
 * MouseDriver.java - example from the book *
 *                                          *
 * This is a driver for the mouse class.    *
 ********************************************/
import java.util.Scanner;

public class MouseDriver {

    public static void main(String[] args)
    {
        Scanner stdIn = new Scanner(System.in);
        double growthRate;
        Mouse gus = new Mouse();
        Mouse jaq = new Mouse();

        System.out.print("Enter % growth rate: ");
        growthRate = stdIn.nextDouble();
        gus.setPercentGrowthRate(growthRate);
        jaq.setPercentGrowthRate(growthRate);
        gus.grow();
        jaq.grow();
        // gus.grow();
        gus.display();
        jaq.display();
    }
    
}
