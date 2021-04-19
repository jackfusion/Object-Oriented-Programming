/****************************************************************
 * Mouse2.java - example from the book                          *
 *                                                              *
 * This class models a mouse for a growth simulation program.   *
 ****************************************************************/
import java.util.Scanner;

public class Mouse2 {
    private int age = 0; // age in days
    private double weight = 1.0; // weight in grams
    private double percentGrowthRate; // % daily weight gain

    //*************************************************************

    public void setPercentGrowthRate (double percentGrowthRate)
    {
        this.percentGrowthRate = percentGrowthRate;
    }

    //*************************************************************

    public int getAge()
    {
        return this.age;
    }

    //*************************************************************

    public double getWeight()
    {
        return this.weight;
    }

    //*************************************************************

    public void grow(int days)
    {
        for (int i=0; i<days; i++)
        {
            this.weight += (0.01 * this.percentGrowthRate * this.weight);
        }
        this.age += days;
    }
}
