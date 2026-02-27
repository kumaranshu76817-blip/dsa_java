import java.util.Scanner;

public class functions_01 {
    public static void printMyName(String name){
        System.out.print(name);
        return;
    }
    public static int calucalteSum(int a, int b){
        return a+b;
    }
    public static int calculateProduct(int c, int d){
        return c *d;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calucalteSum(a, b);
        System.out.println("the multiply of two number is :" + calculateProduct(a, b));
        System.out.println("sum of 2 numbers is :"+sum);
        // printMyName(name);
    }
}
