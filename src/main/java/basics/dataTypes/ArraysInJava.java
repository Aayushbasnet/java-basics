package basics.dataTypes;

public class ArraysInJava {
    public static void main(String[] args) {
        /* Arrays refers to list of that data type. It does not hold the list, it only refers to them.
            Array is called a reference type. We also need allocate some memory for an Array
         */

        int number = 10; // Here variable number of integer type holds the value 10. Here, this variable is of primitive type

        /* Here the variable numbers of array of interger data type refers to the values in the list
            The following variable is of reference type
         */
        int[] numbers = new int[5]; // Array of 5 integers or size 5

        System.out.println("Default value of array index 3 is :" + numbers[3]); // By default, java gives default values to the index in an array. Eg: For array of integers default value is 0. For array of strings default value is null. For boolean it is false

        numbers[0] = 30;
        numbers[1] = 12;
        numbers[2] = 22;
        numbers[3] = 8;
        numbers[4] = 18;
        // Assigning value to array greater than the array size will give out of bound exception. Eg: number[5] = 40;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Value of array index " + i + " is: " + numbers[i]);
        }

        // short form for above numbers
        int[] shortFormNumber = {1,43,23,14,31};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Short form number: array index " + i + " is: " + shortFormNumber[i]);
        }
    }
}
