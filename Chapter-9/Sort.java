/************************************************************
 * Sort.java - example from the book                        *
 *                                                          *
 * This class uses a selection sort to sort a single array. *
 ************************************************************/

public class Sort {
    public static void sort(int [] list)
    {
        int j;  //index of smallest value

        for (int i = 0; i<list.length; i++){
            j = indexOfNextSmallest(list, i);
            swap(list, i, j);
        }
    }

    //************************************************************

    private static int indexOfNextSmallest(int[] list, int startIndex)
    {
        int minIndex = startIndex; // index of smallest value
        for (int i = startIndex + 1; i < list.length; i++) {
            if (list[i] < list[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    //**************************************************************

    private static void swap(int[] list, int i, int j)
    {
        int temp; // temporary holder for number
        
        temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }
}
