/************************************************
 * SortDriver.java - example from the book      *
 *                                              *
 * This exercises selection sort in class sort  *
 ************************************************/

public class SortDriver {
    public static void main(String[] args) {
        int[] studentIds = { 3333, 1234, 2222, 1000 };

        Sort.sort(studentIds);
        for (int i = 0; i < studentIds.length; i++) {
            System.out.print(studentIds[i] + " ");
        }
    }
}
