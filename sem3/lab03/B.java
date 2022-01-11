import java.util.Scanner;
import java.lang.Exception;

class odd_exception extends Exception{
    odd_exception(String msg, int num){
        System.out.println(msg);
        System.out.println("Invalid number is "+num);
    }
}

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type an integer here : ");
        int a = sc.nextInt();
        try{
            if(a%2 != 0){
                throw new odd_exception("Number is odd", a);
            }
        }
        catch(odd_exception oe){
            System.out.println("Caught my exception");
        }
        System.out.println("Program executed");
        sc.close();
    }
}