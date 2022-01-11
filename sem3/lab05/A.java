import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type a positive int here :");
        int num = sc.nextInt();
        if(num >= 0){
            System.out.println(num+"*"+num+" = "+(num*num));
        }
        else {
            throw new ArithmeticException("Given number is negative");
        }
        sc.close();
    }    
}