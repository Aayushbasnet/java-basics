package basics.filereading;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws FileNotFoundException {
        String filePath = "src/main/files/test.txt";

        File file = new File(filePath);

        Scanner text = new Scanner(file);


        while(text.hasNextLine()){
            if(text.hasNextInt()){
                int value = text.nextInt();
                System.out.println("val " + value);
                continue;
            }
            String line = text.nextLine();
            System.out.println(line);
        }
        text.close();

    }
}
