/************************************************************************************************************
 * CourseDriver.java - example from the book                                                                *
 *                                                                                                          *
 * This class creates a Course object and searches for a student ID within the newly created Course object. *
 ************************************************************************************************************/
import java.util.Scanner;

public class CourseDriver {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int[] ids = { 4142, 3001, 6020 };
        Course course = new Course("CS101", ids, ids.length);
        int id; // ID being searched for
        int index; // index of ID sought or -1 if not found

        System.out.print("Enter 4-digit ID: ");
        id = stdIn.nextInt();
        index = course.findStudent(id);
        if (index >= 0) {
            System.out.println("found at index " + index);
        } else {
            System.out.println("not found");
        }
    }
}
