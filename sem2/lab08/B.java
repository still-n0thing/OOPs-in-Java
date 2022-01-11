class Person{
    String name;
    int age;

    // This is used here
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    Person(Person other){
        this.name = other.name;
        this.age = other.age;
    }

    void display(){
        System.out.println("Name :"+this.name);
        System.out.println("Age :"+this.age);
    }
}

public class B {
    public static void main(String[] args) {
        // Used This in the constructor
        Person p1 = new Person("Benq", 21);
        p1.display();
    }
}
