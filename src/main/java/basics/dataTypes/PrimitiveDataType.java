package basics.dataTypes;

public class PrimitiveDataType {
    // primitive data types are written in small letters
    public static void main(String[] args){
        int intValue =42;
        short shortInt = 100;
        long longInt = 123;
        float floatValue = 12.11111F;
        double doubleValue = 23.88687;
        char charValue = 'b';
        boolean booleanValue = true; // true or false
        byte byteValue = 127; // ranges from -128 to 127 (6 bit data)

        System.out.println("int " + intValue);
        System.out.println("short " + shortInt);
        System.out.println("long " + longInt);
        System.out.println("float " + floatValue);
        System.out.println("double " + doubleValue);
        System.out.println("char " + charValue);
        System.out.println("boolean " + booleanValue);
        System.out.println("byte " + byteValue);
    }
}
