package basics.oopConcepts.constructors.TypesOfConstructor;

/*
    Here we can also find the example for constructor overloading which is just like method overloading
    The compiler differentiates constructors on the basis of the number of parameters, types of parameters, and order of the parameters.
*/

/*
    this. is used to set values for local variables where as this() is used to call constructor inside a constructor
 */
public class TypesOfConstructor {
    String name;
    int age;

    /*
        default constructor: it has no parameter. It is also invisible.
        It can be overloaded to parameterized constructor by passing parameter as arguments but
    */
    TypesOfConstructor(){
        System.out.println("I am default constructor");
    }

    /*
        parameterized constructor: it has parameters. Used to initialize fields of class with our own values.
    */


    TypesOfConstructor(String name, int age){
        this(); // Call to 'this()' must be first statement in constructor body
        System.out.println("Called default constructor inside parameterized constructor" );
        this.name = name;
        this.age = age;
        System.out.println("Parameters are: name: " + name + " age: " + age);
    }

    /*
        Remember: Does constructor return any value?
        There are no “return value” statements in the constructor, but the constructor returns the current class instance.
        We can write ‘return’ inside a constructor.
     */


    /*
        copy constructor: in this constructor an object is passed as a parameter.
        Then the data available of this passed object is copied to another created objects.
     */

    TypesOfConstructor(TypesOfConstructor object2){
        this("Sanjeeta Bhandari", 23); // Call to 'this()' must be first statement in constructor body
        System.out.println("Called parameterized constructor inside copy constructor");
        this.name = object2.name;
        this.age = object2.age;
        System.out.println("Copy constructor values: name: " + this.name + " age: " + this.age);
    }

    public static void main(String[] args) {
        // This would invoke default constructor
        TypesOfConstructor defaultConstructor = new TypesOfConstructor();

        // This would invoke parameterized constructor
        TypesOfConstructor parameterizedConstructor = new TypesOfConstructor("Aayush Basnet", 24);

        // This would invoke copy constructor
        TypesOfConstructor copyConstructor = new TypesOfConstructor(parameterizedConstructor);
    }
}

