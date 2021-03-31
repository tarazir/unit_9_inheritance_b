// Program: Mr. Tarazi, HS ASK Technology Teacher
// Date: March 31st, 2021
// Objective: Unit 9 - Inheritance - RFQ - Question #2

public class Main {

    public static void main(String[] args) {

        // Question 2 - Animal FRQ - (a)
        Animal lisa = new Animal("carnivore", "lion", "Lisa");
        System.out.println(lisa.toString());

        // Question 2 - Animal FRQ - (b)
        Herbivore gary = new Herbivore("giraffe", "Gary");
        System.out.println(gary.toString());

        // Question 2 - Animal FRQ - (c)
        Elephant percy = new Elephant("Percy", 2.0);
        System.out.println(percy.toString());
    }
}
