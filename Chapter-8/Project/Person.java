public class Person {
    private String _first;
    private String _last;
    private static int numberOfPeople = 0;

    public Person() {
        _first = "john";
        _last = "Doe";
        numberOfPeople ++;
    }
    public Person(String first, String last) {
        _first = first;
        _last = last;
        numberOfPeople++;
    }
    
    public void setFirst(String newFirst) {
        _first = newFirst;
    }

    public void setLast(String newLast) {
        _last = newLast;
    }

    public static int getNumOfPeople(){
        return numberOfPeople;
    }

    public void printFullName(){
        System.out.println(_first + " " + _last);
        //return this;
    }


}
