package basics.argumentpassing;

/*
    A copy of the actual value is passed to the function.
    Changes to the parameter inside the function do not affect the original value.

    When we declare primitive variables, we are creating memory to actually hold this value.
    But when we declare non-primitive variables, we are not creating memory to actually hold this object. Instead, we are creating
        an address to where this object is being stored.
 */
public class PassByValue {
    public static void main(String[] args) {
        PassByValue pv = new PassByValue();

        // Passing primitive type
        int number = 5;
        System.out.println("Value of number in main() before passing " + number);
        pv.display(number);
        System.out.println("Value of number in main() after passing " + number);

        // Passing non-primitive types
        ArgumentPassingHelper agh = new ArgumentPassingHelper("Xborg");
        System.out.println("agh name before modification: " + agh);
        pv.display(agh);
        System.out.println("agh name after modification: " + agh);
    }

    public void display(int number){
        System.out.println("Value in display() before calculation: " + number);
        number += 10;
        System.out.println("Value in display() after calculation: " + number);
    }

    public void display(ArgumentPassingHelper agh){
        System.out.println("agh name is: " + agh);
        agh =  new ArgumentPassingHelper("Hilda");
        System.out.println("Modified agh name is: " + agh);
    }
}
