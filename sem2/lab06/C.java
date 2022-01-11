class Calculator{
    int A;
    int B;
    int C;
    int D;

    Calculator(int a, int b){
        A = a;
        B = b;
        System.out.println("Addition :"+ additon(A, B));
        System.out.println("Substraction :"+ substraction(A, B));
        System.out.println("Multiplication :"+ multipication(A, B));
        System.out.println("Division :"+ division(A, B));
        System.out.print("\n");
    }

    Calculator(int a, int b, int c){
        A = a;
        B = b;
        C = c;
        System.out.println("Addition :"+ additon(A, B, C));
        System.out.println("Substraction :"+ substraction(A, B, C));
        System.out.println("Multiplication :"+ multipication(A, B, C));
        System.out.println("Division :"+ division(A, B, C));
        System.out.print("\n");
    }

    Calculator(int a, int b, int c, int d){
        A = a;
        B = b;
        C = c;
        D = d;
        System.out.println("Addition :"+ additon(A, B, C, D));
        System.out.println("Substraction :"+ substraction(A, B, C, D));
        System.out.println("Multiplication :"+ multipication(A, B, C, D));
        System.out.println("Division :"+ division(A, B, C, D));
        System.out.print("\n");
    }

    int additon(int a, int b){
        return a + b;
    }
    int additon(int a, int b, int c){
        return additon(a, b)+c;
    }
    int additon(int a, int b, int c, int d){
        return additon(a, b, c)+c;
    }

    int substraction(int a, int b){
        return a - b;
    }
    int substraction(int a, int b, int c){
        return substraction(a, b) - c;
    }
    int substraction(int a, int b, int c, int d){
        return substraction(a, b, c)-d;
    }

    int multipication(int a, int b){
        return a*b;
    }
    int multipication(int a, int b, int c){
        return multipication(a, b)*c;
    }
    int multipication(int a, int b, int c, int d){
        return multipication(a, b, c)*d;
    }

    double division(int a, int b){
        return (double)a/b;
    }
    double division(int a, int b, int c){
        return division(a, b)/c;
    }
    double division(int a, int b, int c, int d){
        return division(a, b, c)/d;
    }
}

public class C {
    public static void main(String[] args) {
        Calculator c1 = new Calculator(2, 1);
        Calculator c2 = new Calculator(3, 2, 1);
        Calculator c3 = new Calculator(4, 3, 2, 1);
    }    
}
