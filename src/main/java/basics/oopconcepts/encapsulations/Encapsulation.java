package basics.oopconcepts.encapsulations;

class Car {
    private String type;
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        /*
            Encapsulation is used to integrate attributes(variables/data) and behaviours(methods) into single unit.
            In encapsulation, a class's variables are hidden from other classes and can only be accessed by the methods of the class in which they are found.
            eg: private String type as in above Car class. We can access this type only through getType() or setType() method.
        */
    }
}
