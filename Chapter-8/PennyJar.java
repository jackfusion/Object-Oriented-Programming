/*************************************************************
 * PennyJar.java- example from the book                      *
 *                                                           *
 * This class counts pennies stored in a group of penny jars.*
 *************************************************************/

public class PennyJar {
    private static int goal;
    private static int allPennies = 0;
    private static int pennies = 0;

    //****************************************************************

    public static void setGoal(int goal) {
        PennyJar.goal = goal;
    }

    //****************************************************************

    public static int getAllPennies() {
        return PennyJar.allPennies;
    }

    //****************************************************************

    public int getPennies() {
        return this.pennies;
    }

    //****************************************************************

    public void addPenny() {
        System.out.println("Click!");
        this.pennies++;
        PennyJar.allPennies++;

        if (PennyJar.allPennies >= PennyJar.goal) {
            System.out.println("Time to spend!");
        }
    }
}
