package basics.enumtype;

public class EnumType {
    public static void main(String[] args) {
        TrafficLightEnum color = TrafficLightEnum.YELLOW;
        System.out.println("Entered color is: " + color);
        switch (color){
            case TrafficLightEnum.RED -> {
                System.out.println("Red color. " + TrafficLightEnum.RED.getMeaning());
            }
            case TrafficLightEnum.GREEN -> {
                System.out.println("Green color. " + TrafficLightEnum.GREEN.getMeaning());
            }
            case TrafficLightEnum.YELLOW -> {
                System.out.println("Yellow color. " + TrafficLightEnum.YELLOW.getMeaning());
            }
            default -> {
                System.out.println("Invalid color");
            }
        }

        /*
            These enums are not strings but special objects of TrafficLightEnum enum. We refer to them as enum constant.
            We can turn them into string using .name() method or override the string method using toString() method.
        */
        System.out.println(TrafficLightEnum.GREEN);
        System.out.println("Is EnumExample.YELLOW instanceof EnumExample? " + (TrafficLightEnum.YELLOW instanceof TrafficLightEnum));
        System.out.println("Meaning of EnumExample.RED: " + TrafficLightEnum.RED.getMeaning());
        System.out.println("Enum meaning as a string is: " + TrafficLightEnum.YELLOW.name()); // eg: Useful when we need to store enum constant in database
        System.out.println("Reverse of enum constant: " + TrafficLightEnum.valueOf("YELLOW"));
    }
}
