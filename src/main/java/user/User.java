package user;

public class User {
    int x = 10;
    int y = 12;

    private int doAdd(){
        return this.getX() + this.getY();
    }

    private int getX(){
        return this.x;
    }

    private int getY(){
        return this.y;
    }

    public static void main(String[] args){
        User user = new User();
        int sum = user.doAdd();
        System.out.println("Sum is: " + sum);
        System.out.println("Hello World!");
        System.out.println();
        for (int i = 0; i < 10; i++){
            System.out.println(i);
        }
    }
}
