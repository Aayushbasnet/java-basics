package basics.exceptionhandling;

/*
    There are 2 types of exception in java. They are: Checked Exception and Runtime/Unchecked Exception
    Checked Exception: This exception are the kind that we're forced to handle like the example in MultipleExceptionHandling class
    Runtime exception: This exception are the exception that we are not forced to handle or that we don't have to handle. These are called
        unchecked exceptions or runtime exceptions. Example: division by zero (x/0), Null pointer exception, Out of bound, etc.
        They are fundamental errors in our program. We should not catch these exception even if we can because they do generally point to fundamental
        flaws in our program which we really need to fix.
*/
public class RuntimeException {
    public static void main(String[] args) {
        // Divide by zero exception example
        int value = 1;
        int division = value/0;
        System.out.println("division value: " + division);

        // Null pointer exception example
        String string1 = null;
        System.out.println("String: " + string1.length());

        // Out of bound exception
        String[] stringArray = {"one", "two", "three"};
        System.out.println(stringArray[4]);
    }
}
