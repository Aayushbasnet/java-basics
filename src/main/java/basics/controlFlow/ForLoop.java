package basics.controlFlow;

public class ForLoop {
    public static void main(String[] args) {
        // initialized i, gave it a conditions and updated i
        for (int i = 0; i < 10; i++) {
            System.out.println("i is running 10 times: " + i);
            System.out.printf("Printing value of i with format specifier: %d ", i);
        }

        // this (;;) format will always return true until we initialize it and give it some conditions and update it.
        for (;;){
            System.out.println("I am running in infinite loop");
        }
    }
}
