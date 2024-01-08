package basics.userinput;

import java.util.Scanner;

public class ScannerBasics {
    public static void main (String[] args){
        String defaultValue = "ABC 1 + 2 = 5.6 \n Hello";
        Scanner defaultStringScanner = new Scanner(defaultValue);
        while(defaultStringScanner.hasNext()){
            if(defaultStringScanner.hasNextFloat()){
                System.out.println("Float: " + defaultStringScanner.nextFloat());
            }else {
                System.out.println("No data");
            }
        }
    }
}
