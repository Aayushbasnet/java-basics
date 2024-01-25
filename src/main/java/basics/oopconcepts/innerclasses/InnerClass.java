package basics.oopconcepts.innerclasses;

/*
    Anonymous classes are a type of inner classes.
    There are three other inner class types.
    We can only have one public class in one file and this class name should match the filename. But we can have multiple private, protected and default class.
    Inner class are most often used for logically grouping different parts of outer classes.
 */
public class InnerClass {
    public static void main(String[] args) {
        Machine machine1 = new Machine(7);
        machine1.run();
        Machine.Tire tire = new Machine.Tire(); // only if its static inner class
        tire.repair();

        // uncomment the code
       //  Machine.ArtificialIntelligence ai = new Machine.ArtificialIntelligence(); // cannot create new ArtificialIntelligence() object outside the outer/main class i.e., Machine
    }

}
