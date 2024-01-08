package basics.controlflow;

public class WhileLoop {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("Initial count is: " + count);
        boolean runLoop = true;
        System.out.println("Initial loop status is: " + runLoop);

        while(runLoop){
            System.out.println("Current count is: " + count);
            System.out.println("Current loop status is: " + runLoop);
            if(count > 10){
                runLoop = false;
            }
            count++;
            System.out.println("Increased count is: " + count );
        }
        System.out.println("Final count is: " + count);
        System.out.println("Final loop status is: " + runLoop);
    }
}
