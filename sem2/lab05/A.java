// import java.util.Scanner;

class calculator {
    int addition(int a, int b, int c){
        return (a+b+c);
    }
    
    int subtraction(int a, int b){
        return (a-b);
    }

    int multiplication(int a, int b, int c, int d){
        return (a*b*c*d);
    }

    float division(int a, int b){
        return ((float)a/b);
    }
}

public class A {
    public static void main(String[] args) {
        calculator calc = new calculator();
        System.out.println(calc.addition(2, 3, 4));
        System.out.println(calc.subtraction(100, 47));
        System.out.println(calc.multiplication(1, 2, 3, 4));
        System.out.println(calc.division(100, 25));
    }
}
