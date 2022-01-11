class Circle{
    double r;

    Circle(double radius){
        r = radius;
    }

    double area(){
        return 3.14*r*r;
    }

    double perimeter(){
        return 2*3.14*r;
    }

    void display(){
        System.out.println("For Circle");
        System.out.println("Area : "+area());
        System.out.println("Perimeter : "+perimeter());
    }
}

class Rectangle{
    double l;
    double b;

    Rectangle(double length, double breadth){
        l = length;
        b = breadth;
    }

    double area(){
        return l*b;
    }

    double perimeter(){
        return 2*(l+b);
    }

    void display(){
        System.out.println("For Reactangle");
        System.out.println("Area : "+area());
        System.out.println("Perimeter : "+perimeter());
    }    
}

class Square{
    double s;

    Square(double side){
        s = side;
    }

    double area(){
        return s*s;
    }

    double perimeter(){
        return 4*s;
    }

    void display(){
        System.out.println("For Square");
        System.out.println("Area : "+area());
        System.out.println("Perimeter : "+perimeter());
    }    
}

public class B {
    public static void main(String[] args) {
        Circle c1 = new Circle(1);
        Rectangle r1 = new Rectangle(2, 3);
        Square s1 = new Square(4);
        c1.display();
        r1.display();
        s1.display();
    }    
}
