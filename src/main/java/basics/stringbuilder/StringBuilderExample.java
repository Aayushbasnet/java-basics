package basics.stringbuilder;

/*
    String builder objects are like string objects, except that they can be modified.
    While we concatenate a string, internally everytime new object  with the result of concatenation of the string is created as we cannot modify the first string.
    But in String builder, the same/original string is modified everytime and hence the result will be one single string builder object.
    So due to this, it will take less memory that when we do it with string as String are immutable object.
 */

public class StringBuilderExample {
    public static void main(String[] args) {
        /*
            concatenation using string. There are 3 string object in this example.
         */
        String example1 = "Hello ";
        example1 += "World! ";
        example1 += "My name is Aayush";

        System.out.println(example1);

        /*
            Concatenation using String builder. There is only 1 string object in this example.
         */

        StringBuilder example2 = new StringBuilder("Hi, ");
        example2.append("I am string builder ");
        example2.append("example");

        System.out.println(example2);

        String name = "Aayush Basnet";
        StringBuilder example3 = new StringBuilder(); // this can be our initial value
        example3.append("We can also using method chaining.").append(" Like this append1")
                .append(" I am append 2 and I have appended name of type string: ").append(name);
        System.out.println(example3);
    }
}
