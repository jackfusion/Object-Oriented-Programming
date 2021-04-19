/****************************************************
 * MouseDriver2.java - example from the book        *
 *                                                  *
 * version 2 This is a driver for the MOuse Class   *
 ****************************************************/
import java.util.Scanner;

public class MouseDriver2 
{
    public static void main(String[] args)
    {
        Scanner stdin = new Scanner(System.in);
        double growthRate;
        Mouse gus, jaq;

        System.out.print("Enter % growth rate: ");
        growthRate = stdin.nextDouble();
        gus = new Mouse();
        gus.setPercentGrowthRate(growthRate);
        gus.grow();
        gus.display();
        jaq = new Mouse();
        jaq.setPercentGrowthRate(growthRate);
        jaq.grow();
        jaq.display();
    }
}
