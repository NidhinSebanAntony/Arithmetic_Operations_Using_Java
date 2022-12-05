import java.util.*;
public class BasicArithmeticOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int x = input.nextInt();
        int y = input.nextInt();
        addition(x,y);
        subtraction(x,y);
        division(x,y);
        multiplication(x,y);
    }

    public static void addition(int x, int y){
        int add = x + y;
        System.out.println(x+" + "+y+" = "+ add);
    }

    public static void subtraction(int x, int y){
        int sub = x - y;
        System.out.println(x+" - "+y+" = "+ sub);
    }


    public static void division(int x, int y){
        int div = x / y;
        System.out.println(x+" / "+y+" = "+ div);
    }
    public static void multiplication(int x, int y){
        int mul = x * y;
        System.out.println(x+" * "+y+" = "+ mul);

    }
}