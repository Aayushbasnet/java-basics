package basics.conditionalStatements;

public class IfStatement {
    public static void main(String[] args) {
        // = means assigning values to a variable. == means comparison
        int age = 75;

        if (12 >= age) {
            System.out.println("You are a kid");
        } else if (13 <= age && 19 >= age) {
            System.out.println("You are a teenager");
        } else if( 60 >= age){
            System.out.println("You are an adult");
        }else{
            System.out.println("You are old");
        }
    }
}
