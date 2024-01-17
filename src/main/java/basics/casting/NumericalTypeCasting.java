package basics.casting;

/*
    Casting is only needed when you want to assign values that has a bigger memory to values that has smaller memory because
    the values will often be chopped off. We can cast only numerical values.
    syntax: numerical data type variableName = (numerical data type) value;
    For eg: if we have double or float, and we want to assign them into an integer. We know that this double and float has enough memory to
    fit int, long, short or byte, so we do not need to cast. Casting is only done when we want to assign the bigger memory values to smaller memory
    values by often chopping off the values.
 */

public class NumericalTypeCasting {
    private void calculateSizeOfDifferentDataTypes(){
        System.out.println("Byte: "+ Byte.SIZE);
    }

    public static void main(String[] args) {
        byte byteValue = 3;
        short shortValue = 38;
        int intValue = 27;
        long longValue = 9034;
        float floatValue = 123.6334f;
        double doubleValue = 17656.33;

        System.out.println(Byte.SIZE);

        intValue  = (int) floatValue; // we cast int as int does not have enough value to fit float. So decimal part will be chopped here.
        System.out.println("Int value: " + intValue);

        floatValue = (float) intValue; // usually we do not cast int as float has enough value to fit integer.
        System.out.println("Float Value: " + floatValue);

        /*
            We cannot cast string to numerical data type or vice-versa.
            We need to use Numerical_Data_Type.toString() or Numerical_Data_Type.parseInt() respectively;
         */
        // Numerical data type to String
        String integerToStringValue = Integer.toString(1000);
        System.out.println("Integer to string: "+ integerToStringValue);

        String floatToStringValue = Float.toString(345.768f);
        System.out.println("Float to string: " + floatToStringValue);

        // String to numerical data type

        int stringToInteger = Integer.parseInt("346");
        System.out.println("String to integer: " + stringToInteger);

        float stringToFloat = Float.parseFloat("456.77");
        System.out.println("String to float: " + stringToFloat);
    }
}
