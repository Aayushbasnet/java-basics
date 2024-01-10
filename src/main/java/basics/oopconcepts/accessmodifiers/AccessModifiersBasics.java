package basics.oopconcepts.accessmodifiers;

/*
    4 types of access modifiers: public, private, protected and default.
    default access modifier: It occurs when there is no access modifier (lack of access modifier)
 */

public class AccessModifiersBasics extends AccessModifierExamples {

    public static void main(String[] args) {
        AccessModifiersBasics accessModifiersBasics = new AccessModifiersBasics();

        System.out.println("--------PUBLIC CLASS------");
        // accessing public method of AccessModifierExamples class
        accessModifiersBasics.publicAccessModifierExample();

        System.out.println("--------PROTECTED CLASS------");
        // accessing protected method of AccessModifierExamples class
        accessModifiersBasics.protectedAccessModifierExample();

        System.out.println("--------Default CLASS------");
        // accessing default method of AccessModifierExamples class
        accessModifiersBasics.defaultAccessModifierExample();

        System.out.println("--------PRIVATE CLASS------");
        // cannot access private method of AccessModifierExamples class.
        // accessModifiersBasics.privateAccessModifierExample();

        // Only same class can access private method
        accessModifiersBasics.viewPrivateAccessModifierExample();

    }
}
