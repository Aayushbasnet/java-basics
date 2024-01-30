package basics.argumentpassing;

public class PassByReference {
    public static void main(String[] args) {
        PassByReference pr = new PassByReference();

        // Passing non-primitive types
        ArgumentPassingHelper agh = new ArgumentPassingHelper("Xborg");
        System.out.println("agh name before modification: " + agh);
        pr.display(agh);
        System.out.println("agh name after modification: " + agh);
    }

    public void display(ArgumentPassingHelper agh){
        System.out.println("agh name is: " + agh);
        agh.setName("Martis"); // this agh is still pointing to reference of the object in line 8
        agh =  new ArgumentPassingHelper("Hilda");
        agh.setName("Vale"); // now this agh is pointing to the new reference of the newly created object in line 17
        System.out.println("Modified Prh name is: " + agh);
    }
}
