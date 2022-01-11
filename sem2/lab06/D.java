import java.util.Scanner;

class circle{
    double r;

    circle(double radius){
        r = radius;
    }

    double area(){
        return 3.14*r*r;
    }

    double perimeter(){
        return 2*3.14*r;
    }

    void display(){
        System.out.println("Area : "+area());
        System.out.println("Perimeter : "+perimeter());
    }
}

class rectangle{
    double l;
    double b;

    rectangle(double length, double breadth){
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
        System.out.println("Area : "+area());
        System.out.println("Perimeter : "+perimeter());
    }    
}

public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type radius of circle here :");
        double radius = sc.nextDouble();
        circle c1 = new circle(radius);
        c1.display();
        System.out.print("Type l and b of rectangle here :");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        rectangle r1 = new rectangle(l, b);
        r1.display();
        sc.close();        
    }
}
