/********************************************
 * Mouse2Driver.java - example from the book*
 *                                          *
 * This is Driver for the Mouse2 class      *
 ********************************************/
import java.util.Scanner;

public class Mouse2Driver 
{
    public static void main(String[] args)
    {
        Scanner stdin = new Scanner(System.in);
        Mouse2 mickey = new Mouse2();
        int days;

        mickey.setPercentGrowthRate(10);
        System.out.print("Enter number of days to grow: ");
        days = stdin.nextInt();
        mickey.grow(days);
        System.out.printf("Age = %d, weight = %.3f\n", mickey.getAge(), mickey.getWeight());
    }
}
