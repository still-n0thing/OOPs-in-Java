abstract class Shape{
    abstract void RectangleArea(double l, double b);
    abstract void SquareArea(double s);
    abstract void CircleArea(double r);
}

class Area extends Shape{
    void RectangleArea(double l, double b){
        double area = l*b;
        System.out.println("Area of Rectangle : "+ area);
    }
    void SquareArea(double s){
        double area = s*s;
        System.out.println("Area of Square : "+ area);
    }
    void CircleArea(double r){
        double area = 3.14*r*r;
        System.out.println("Area of Circle : "+ area);
    }
}

public class B {
    public static void main(String[] args) {
        Area a1 = new Area();
        a1.RectangleArea(4, 5);
        a1.SquareArea(11);
        a1.CircleArea(1);
    }
}
