class Organism{
    int age;

    void displayAge(){
        System.out.println("Age of Organism :"+age);
    }

    Organism(int a){
        age = a;
    }
}

class Dog extends Organism{
    String breed;

    Dog(int a, String s){
        super(a);
        breed = s;
    }

    void display(){
        displayAge();
        System.out.println("Breed of dog : "+breed);
    }
}


public class A {
    public static void main(String[] args) {
        Dog d1 = new Dog(5, "Pug");
        d1.display();
    }
}
