package basics.oopconcepts.accessmodifiers;

public class AccessModifierExamples {
    void defaultAccessModifierExample(){
        System.out.println("I am default access modifier.\nI can be only called by the same class or by other classes in the same package.\nI cannot be accessed by other classes in different package even if I am being extended or inherited");
    }

    public void publicAccessModifierExample(){
        System.out.println("I am public access modifier. \nI can be accessed by any class, anywhere, by anyone regardless of whether the classes are or aren't in the same package");
    }

    private void privateAccessModifierExample(){
        System.out.println("I am private access modifier.\nI can only be accessed by the same class.\nI cannot be accessed by any other class");
    }

    protected void protectedAccessModifierExample(){
        System.out.println("I am protected access modifier.\nI can be accessed by the same class, by other classes in the same package or by extending (inheriting) this class by other classes in different package");
    }

    public void viewPrivateAccessModifierExample(){
        System.out.println("Accessing private method through same class");
        this.privateAccessModifierExample();
    }
}
