/************************************************************
 * PersonDriver.java - example from the book                *
 *                                                          *
 * This class is a demostration driver for the person class.*
 ************************************************************/

public class PersonDriver {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();

        person1.setName("Johnathan");
        person2.setName("Benji");
        System.out.println(person1.getName() + ", " + person2.getName());

        person1.swapPerson(person2);
        System.out.println(person1.getName() + ", " + person2.getName());
    }
}
