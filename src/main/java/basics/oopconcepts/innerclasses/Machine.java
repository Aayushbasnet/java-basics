package basics.oopconcepts.innerclasses;

import org.w3c.dom.ls.LSOutput;

public class Machine {
    private int id;

    public Machine(int id){
        this.id = id;
    }

    // This ArtificialIntelligence class is inner class and can also a called as nested class (one of three types)
    class ArtificialIntelligence{
        public void activate(){
            System.out.println("Machine " + id + " is activated."); // this class (ArtificialIntelligence class) can access the property of its parent class i.e, Machine class
        }
    }

    // Static inner classes (one of 3 types)

    static class Tire{
        public void repair(){
            System.out.println("Tires are repaired"); // static class can access only static variable of the outer class. So, we cannot append this.id
        }
    }

    public void run(){
        System.out.println("Running machine: " + id + " " + this.id);

        ArtificialIntelligence ai = new ArtificialIntelligence();
        ai.activate();

        final String type = "electric";

        // we can declare class even within the method
        class Speed{ // We cannot make this private, public or protected as its scope is only inside run(){ //here }. We can create instance only in this method because we cannot refer to this class outside this method.
            public void speedCalculator(){
                System.out.println("Speed of id " + id + " is high");
                System.out.println("Type is " + type);
            }
        }
        Speed speed1 = new Speed();
        speed1.speedCalculator();
    }
}
