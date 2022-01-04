package TabliceJednowymiarowe.Ćwiczenie2;

public class Elevator {

    private Person[] people = new Person[4];
    private int peopleNumber = 0;
    private final int maxWeight = 400;

    public void add(Person person) {
        if (peopleNumber < 4) {
            people[peopleNumber] = person;
            peopleNumber++;
        } else {
            System.out.println("W windzie nie ma juz miejsca, proszę czekać.");
        }
    }

    public void start () {
        if (peopleNumber < 4 && maxWeight < 400) {
            
        }
    }

}
