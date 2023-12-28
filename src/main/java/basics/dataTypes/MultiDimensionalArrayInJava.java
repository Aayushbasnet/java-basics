package basics.dataTypes;

public class MultiDimensionalArrayInJava {
    public static void main(String[] args) {
        int [][] numbers = {{1,2}, {34,56}, {22,67}};

        for (int i = 0; i < numbers.length; i++) {
            for (int j=0; j<numbers[i].length ; j++) {
                System.out.println("For Row: "+ i);
                System.out.println("For column: " + j);
                System.out.println("Row and column: [" + i + "]" + "[" +j + "]");
                System.out.println("Value:" +numbers[i][j] + "\n");
            }
        }

        int rows = 3;
        int columns = 3;
        int [][] twoDimArray = new int[rows][columns];

        int arrayValue = 1;
        for (int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++){
                twoDimArray[i][j] = arrayValue;
                arrayValue ++;
            }
        }

        System.out.println("The 2-D array is: ");
        for (int l = 0; l < rows; l++) {
            for (int m = 0; m < columns; m++){
                System.out.print(twoDimArray[l][m] + " ");
            }
            System.out.println();
        }

    }
}
