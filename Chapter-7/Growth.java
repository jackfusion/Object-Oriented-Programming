/****************************************************
 * Growth.java - example from the book              *
 *                                                  *
 * This provides different ways to calculate growth.*
 ****************************************************/

public class Growth {
    private double startSize; // initial size
    private double endSize; // Maximum size
    private double fractionGrowthRate; // pre unit time
    
    //**********************************************************

    public void initialize (double start, double end, double factor)
    {
        this.startSize = start;
        this.endSize = end;
        this.fractionGrowthRate = factor;
    }

    //************************************************************

    public double getSize(double time)
    {
        double g0 = Math.log(startSize / (1.0 - startSize / endSize));

        return 1.0 / (1.0 / endSize + Math.exp(-(fractionGrowthRate * time + g0)));
    }

    //*************************************************************

    public double getSizeIncrement(double size, double timestep)
    {
        return fractionGrowthRate * size * (1.0 - size / endSize) * timestep;
    }

}
