package basics.exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main (String[] args){
        File filePath = new File("./src/main/files/test.txt");
        try{
            Scanner readFile = new Scanner(filePath);

            while(readFile.hasNextLine()){
                System.out.println(readFile.nextLine());
            }
        }catch(FileNotFoundException error){
            error.printStackTrace();
        }
    }
}
