package basics.enumtype;

public enum TrafficLightEnum {
    /*
        These are not strings but special objects of TrafficLightEnum enum. We refer to them as enum constant.
        We can turn them into string using .name() method or override the string method using toString() method.
     */
    RED("Stop"), GREEN("Go"), YELLOW("Wait");

    private String meaning;

    TrafficLightEnum(String meaning){
        this.meaning = meaning;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    @Override
    public String toString() {
        return "TrafficLightEnum{" +
                "meaning='" + meaning + '\'' +
                '}';
    }
}
