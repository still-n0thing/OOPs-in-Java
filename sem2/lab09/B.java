class Person{
    Person(){
        System.out.println("Person class created");
    }    

    void type(){
        System.out.println("Type : mammals");
    }
}

class Student extends Person{
    Student(){
        System.out.println("Currently : Student");
    }

    void subject(){
        System.out.println("Subject : CSE");
    }
}

class Sem2 extends Student{
    Sem2(){
        System.out.println("Sem : 02");
    }

    void year(){
        System.out.println("Year : 01");
    }
}

public class B {
    public static void main(String[] args) {
        Sem2 s = new Sem2();
        s.type();
        s.subject();
        s.year();
    }
}
