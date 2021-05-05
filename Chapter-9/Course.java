/********************************************************
 * Course.java - example from the book                  *
 *                                                      *
 * This class represents a particular course in a school*
 ********************************************************/

public class Course {
    private String courseName; // name of the Course
    private int[] ids; // IDs for students in the Course
    private int filledElements; // number of filled-in elements

    //********************************************************

    public Course(String couseName, int[] ids, int filledElements) {
        this.courseName = couseName;
        this.ids = ids;
        this.filledElements = filledElements;
    }

    //********************************************************

    // This method index of found ID or -1 if not found

    public int findStudent(int id) {
        for (int i = 0; i < filledElements; i++) {
            if (ids[i] == id) {
                return i;
            }
        }
        return -1;
    }
}
