class Entity{
    String name;
    int age;

    Entity(String n, int a){
        name = n;
        age = a;
    }

    Entity(Entity other){
        name = other.name;
        age = other.age;
    }

    void display(){
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
    }
}

public class A {
    public static void main(String[] args) {
        Entity e1 = new Entity("Dhaval Kumar", 18);
        e1.display();
        Entity e2 = new Entity(e1);
        e2.display();
    }    
}
