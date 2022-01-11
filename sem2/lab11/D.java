// Overriding is also known as run-time polymorphism

class Car{
    void type(){
        System.out.println("Type : Car (original)");
    }
}

class Tesla extends Car{
    void type(){
        System.out.println("Type : Tesla EV (overriding)");
    }
}

public class D {
    public static void main(String[] args) {
        Tesla t1 = new Tesla();
        t1.type();
    }
}
