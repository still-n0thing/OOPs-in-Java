import java.util.Scanner;

public class Perimeter 

{

    int r, l, b, s1, s2, s3;
    double pi = 3.14,perimeter, area;
    Scanner s = new Scanner(System.in);
    void circle(){
        System.out.print("Enter radius of circle:");
        r = s.nextInt();
        perimeter = 2 * pi * r;
        area = pi * r * r;
        System.out.println("Perimeter of circle:"+perimeter);
        System.out.println("Area of circle:"+area);

    } 

    void rectangle(){
        System.out.print("Enter length of rectangle:");
        l = s.nextInt();
        System.out.print("Enter breadth of rectangle:");
        b = s.nextInt();
        perimeter = 2 * (l + b);
        area = l*b;
        System.out.println("Perimeter of rectangle:"+perimeter);
        System.out.println("Area of rectangle:"+area);

    }

    void square(){
        System.out.print("Enter Side of square:");
        l = s.nextInt();
        b = l;
        perimeter = 2 * (l + b);
        area = l*b;
        System.out.println("Perimeter of Square:"+perimeter);
        System.out.println("Area of Square:"+area);

    }


    public static void main(String[] args) {

        Perimeter obj = new Perimeter();

        obj.circle();
        obj.square();
        obj.rectangle();

    }

}