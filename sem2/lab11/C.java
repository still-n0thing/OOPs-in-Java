// Overloading is also known as compile-time polymorphism

class Calculator{
    void add(int a, int b){
        System.out.println(a+" + "+b+" = "+(a+b));
    }

    void add(int a, int b, int c){
        System.out.println(a+" + "+b+" + "+c+" = "+(a+b+c));
    }
}

public class C {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.add(10, 20);
        c1.add(10, 20, 30);
    }
}
