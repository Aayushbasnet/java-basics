package basics.conditionalstatements;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        boolean isEndRequest = false;

        while(!isEndRequest){
            System.out.println("Select from following options to get basic math example:\n 1) Add \n 2) Subtract \n 3) Multiply \n 4) Division \n 0) End");
            System.out.println("Select option: ");
            int userOption = userInput.nextInt();
            try{
                switch (userOption){
                    case 1:
                        System.out.println("Ans: 1 + 2 = 3");
                        break;
                    case 2:
                        System.out.println("Ans: 5 - 2 = 3");
                        break;
                    case 3:
                        System.out.println("Ans: 2 * 4 = 8");
                        break;
                    case 4:
                        System.out.println("Ans: 10 / 2 = 5");
                        break;
                    case 0:
                        isEndRequest = true;
                        System.out.println("Thank you!");
                        break;
                    default:
                        System.out.println("Incorrect input");
                        break;
                }
            }catch (Exception error){
                System.out.println("Error: " + error);
            }
        }

        // using labeled break statement
        userInput = new Scanner(System.in);
        mainLoop: while(true){
            System.out.println("Welcome to labeled break statement example\n");
            System.out.println("Select from following options to get basic math example:\n 1) Add \n 2) Subtract \n 3) Multiply \n 4) Division \n 0) End");
            System.out.println("Select option: ");
            int selection = userInput.nextInt();
            try{
                switch (selection){
                    case 1:
                        System.out.println("Ans: 1 + 2 = 3");
                        break;
                    case 2:
                        System.out.println("Ans: 5 - 2 = 3");
                        break;
                    case 3:
                        System.out.println("Ans: 2 * 4 = 8");
                        break;
                    case 4:
                        System.out.println("Ans: 10 / 2 = 5");
                        break;
                    case 0:
                        System.out.println("Thank you!");
                        break mainLoop;
                    default:
                        System.out.println("Incorrect input");
                        break;
                }
            }catch (Exception error){
                System.out.println("Error: " + error);
            }

        }
        userInput.close();
    }
}
