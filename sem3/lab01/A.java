abstract class Shape {
    public abstract void RectangleArea(float l, float b);
    public abstract void SquareArea(float s);
    public abstract void CircleArea(float r);
}

class Area extends Shape {
    public void RectangleArea(float l, float b){
        System.out.println("length = " + l + " & breadth = " + b);
        System.out.println("Area of Rectangle = " + (l*b));
    }
    public void SquareArea(float s){
        System.out.println("side = "+s);
        System.out.println("Area of Square = " + (s*s));
    }
    public void CircleArea(float r){
        System.out.println("radius = " + r);
        System.out.println("Area of Circle = " + (3.14*r*r));
    }

}

public class A {
    public static void main(String[] args) {
        Area ar1 = new Area();
        ar1.RectangleArea(3, 4);        
        ar1.SquareArea(5);
        ar1.CircleArea(1);
    }
}
