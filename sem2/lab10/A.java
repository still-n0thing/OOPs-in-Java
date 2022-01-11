abstract class Car{
    // Static block
    static {
        System.out.println("Static block of abstract class car");
    }

    // Data member
    String color;

    // 2 abstract method
    abstract void display();
    abstract int getSpeed();

    // 2 non-abstract method
    void type(){
        System.out.println("Type : Land");
    }
    void displayColor(){
        System.out.println("Color : "+color);
    }

    // Constructor
    Car(String clr){
        color = clr;
    }

}

class Tesla extends Car{
    String model;
    int speed;
    Tesla(String clr, String model, int speed){
        super(clr);
        this.model = model;
        this.speed = speed;
    }
    void display(){
        System.out.println("Model : "+ model);
        System.out.println("Color : "+color);
        System.out.println("Speed : "+getSpeed());
    }
    int getSpeed(){
        return speed;
    }
}

public class A {
    public static void main(String[] args) {
        Tesla t1 = new Tesla("Red", "S", 90);
        t1.display();
        t1.type();
        t1.displayColor();
    }
}
