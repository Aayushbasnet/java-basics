package basics.exceptionhandling;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class MultipleExceptionHandling {
    private void start() throws IOException, ParseException{
          throw new IOException("Error"); // throws IOException
        // throw new ParseException("Error on line 9", 2); // throws ParseException
    }
    private void end() throws IOException, FileNotFoundException {
        throw new FileNotFoundException("Error"); // throws IOException
    }


    public static void main(String[] args) throws Exception{ // we can use Exception to catch all types of exception or use specific type of exception as in start() method
        MultipleExceptionHandling multipleExceptionHandling = new MultipleExceptionHandling();

        // we can handle the exception by surrounding with multiple catch of specific exception types
        try {
            multipleExceptionHandling.start();
        } catch (IOException e) { /* shorthand can be used to catch error example: catch(IOException | ParseException e){}*/
            throw new RuntimeException(e);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        /*
            we need to also be careful of catching exception in order. Example in case of IOException and FileNotFoundException.
            FileNotFoundException must always come before IOException because FileNotFoundException is an IOException.
            Uncomment code to see error
        */
//        try {
//            multipleExceptionHandling.end();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } catch (FileNotFoundException e) { // will get error
//            throw new RuntimeException(e);
//        }

        // we can handle the exception by surrounding with one catch of type Exception
        try {
            multipleExceptionHandling.start();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
