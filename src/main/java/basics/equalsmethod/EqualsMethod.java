package basics.equalsmethod;

import java.util.Objects;

/*
    What == does is it tells you
        primitive type: Whether two references to objects are pointing at the same object or not.
        non-primitive type: it tells us if those primitive types have the same value
    Hence, we should only use == for primitive types, not for non-primitive types. For non-primitive types use .equals()
    Always us .equals() to compare strings.
 */
class Phone {
    private int id;
    private String brandName;

    public Phone(int id, String brandName){
        this.id = id;
        this.brandName = brandName;
    }
    @Override
    public String toString() {
        return "ID: " + id + " Brand name: " + brandName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return id == phone.id && Objects.equals(brandName, phone.brandName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, brandName);
    }
}
public class EqualsMethod {
    public static void main(String[] args) {
        Phone phone1 = new Phone(1, "Iphone");
        Phone phone2 = new Phone(1, "Iphone");

        System.out.println(new Phone(1, "MAC"));

        System.out.print("phone1 == phone2: ");
        System.out.println( phone1 == phone2); // results false as they both are 2 different object;

        System.out.print("phone1.equals(phone2): ");
        System.out.println(phone1.equals(phone2));// if either id or brandName is different between phone2 & phone1 it will be false

        /*
            Only use == to check if two things/two references point at the same object
            and use .equals to compare strings or objects because this will play false for value.
            == is only checking if these references are literally pointing at the same object or not.
            .eqals
         */
        String a = "Test";
        String b = "Test";
        String c = "Haha";
        String d = new String("Test");
        String e = new String("Test");
        StringBuilder f = new StringBuilder("Haha");

        System.out.print("a == b: ");
        System.out.println(a == b);

        System.out.print("a == d: ");
        System.out.println(a == d);

        System.out.print("d.equals(e): ");
        System.out.println(d.equals(e));

        System.out.print("a == c: ");
        System.out.println(a == c);

        System.out.print("a.equals(f): ");
        System.out.println(a.equals(f));

        String g = "Testssss".substring(0,4);
        System.out.print("a == g: ");
        System.out.println(a==g);
        System.out.print("a.equals(g): ");
        System.out.println(a.equals(g));

    }
}
