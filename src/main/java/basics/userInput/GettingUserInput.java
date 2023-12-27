package basics.userInput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GettingUserInput {
    public static void main(String[] args) {
        //Scanner class used to get input
        Scanner userInput = new Scanner(System.in); // Create a Scanner object
        boolean conversationStatus = false;
        do {
            try {
                System.out.println("Enter your message: ");
                String message = userInput.nextLine(); // reads Strings value from the user
                System.out.println("You message is: " + message);

                System.out.println("Are you a human?");
                boolean isHuman = userInput.nextBoolean(); // reads boolean value from the user
                String humanVerificationMessage = isHuman ? "You are a human" : "You are not human";
                System.out.println(humanVerificationMessage);

                System.out.println("How old are you?");
                int userAge = userInput.nextInt(); // reads integer value from the user
                System.out.println("So, you are " + userAge + " old. Hmm...");

                System.out.println("What is your salary?");
                float userSalary = userInput.nextFloat(); // reads float value from the user
                System.out.println("Oh! Your earning is " + userSalary);

                conversationStatus = false;
            } catch (InputMismatchException error) {
                userInput = new Scanner(System.in);
                conversationStatus = true;
            }
        } while (conversationStatus);
    }
}
