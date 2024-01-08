package basics.oopConcepts;

public class ReturnTypesAndMethodParameters {
    // void return type does not return anything.
    // other return types such as int, String, float and so on return some values

    //method with a parameter and void as return type
    static void displayUsername(String userName){
        System.out.println("Username is: " + userName);
    }

    //method with multiple parameter and void as return type
    static void displayAgeAndSalary(int age, float salary){
        System.out.println("Age is " + age + ". Salary is: " + salary);
    }

    // method with return values
    static int doAdd(int x, int y){
        return x + y;
    }

    public static void main(String[] args) {
        String userName = "Aayush Basnet";
        int age = 23;
        float salary = 30000.0F;
        int x = 5;
        int y = 6;
        ReturnTypesAndMethodParameters.displayUsername(userName);
        ReturnTypesAndMethodParameters.displayAgeAndSalary(age, salary);
        int sum = ReturnTypesAndMethodParameters.doAdd(x, y);
        if(sum > 5){
            System.out.println("Sum is greater than 5: " + sum);
        } else if (sum == 5) {
            System.out.println("Sum is equals to 5: " + sum);
        } else{
            System.out.println("Sum is less than 5: " + sum);
        }
    }
}
