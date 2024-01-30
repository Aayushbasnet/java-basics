package basics.argumentpassing;

public class ArgumentPassingHelper {
    String name;

    public ArgumentPassingHelper(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PassByRefHelper{" +
                "name='" + name + '\'' +
                '}';
    }
}
