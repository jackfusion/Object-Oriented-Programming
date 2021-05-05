/*********************************************************************************************************************
 * ContactList2.java - example from the book                                                                         *
 *                                                                                                                   *
 * This program creates a contacts phone number list and prints the created list.  It uses a partially filled array. *
 *********************************************************************************************************************/
import java.util.Scanner;
public class ContactList2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        String[] phoneList = new String[100]; // phone numbers
        int filledElements = 0; // number of phone numbers
        String phoneNum; // an entered phone number
        
        System.out.print("Enter phone number (or q to quit): ");
        phoneNum = stdIn.nextLine();
        while (!phoneNum.equalsIgnoreCase("q") && filledElements < phoneList.length) {
            if (phoneNum.length() < 1 || phoneNum.length() > 16) {
                System.out.println("Invalid entry. Must enter between 1 and 16 charaters.");
            } else {
                phoneList[filledElements] = phoneNum;
                filledElements++;
            }
            System.out.print("Enter phone number (or q to quit): ");
            phoneNum = stdIn.nextLine();
        }
        System.out.println("\nContect List:");
        for (int i=0; i<filledElements; i++)
        {
            System.out.println((i + 1) + ". " + phoneList[i])
        }
    }
}
