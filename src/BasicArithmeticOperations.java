import java.util.*;
public class BasicArithmeticOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int x = input.nextInt();
        int y = input.nextInt();
        addition(x,y);
    }

    public static void addition(int x, int y){
        int add = x + y;
        System.out.println(x+" + "+y+" = "+ add);
    }
}