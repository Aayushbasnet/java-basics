package basics.ternaryoperators;

public class TernaryOperator {
    public static void main(String[] args) {
        int[] numbers = {10,3,6,7,2,1};
        int lowestNumber = Integer.MAX_VALUE; // simply assigning initial maximum integer value

        for(int currentNumber : numbers){
            System.out.println("LowestNumber before condition value: "+ lowestNumber);
            lowestNumber = currentNumber < lowestNumber ? currentNumber : lowestNumber;
            System.out.println("LowestNumber after condition value: "+ lowestNumber);
        }

        System.out.println("Lowest number is: "+ lowestNumber);
    }
}
