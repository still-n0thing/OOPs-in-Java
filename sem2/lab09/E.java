class ABC{
    void display1(){
        System.out.println("Name : Dhaval Kmar");
    }

    void display2(){
        System.out.println("display2 method of class ABC");
    }
}

class demo extends ABC{
    // Overriding
    void display2() {
        super.display2();
        System.out.println("display2 method of class demo");
    }
}

public class E {
    public static void main(String[] args) {
        demo d1 = new demo();
        d1.display1();
        d1.display2();
    }
}
