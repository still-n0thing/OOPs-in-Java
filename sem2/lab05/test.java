import java.util.Scanner;

class student {
    int rollno;
    String name;

    void set_rollno(int num){
        rollno = num;
    }

    void set_name(String s){
        name = s;
    }

    void set_all(int num, String s){
        rollno = num;
        name = s;
    }
}

public class test{
    public static void main(String[] args) {
        student s1 = new student();
        s1.set_rollno(32);
        s1.set_name("Mukesh");
        System.out.println(s1.name);
        System.out.println(s1.rollno);

        // s1.name = "Mukesh";
        // s1.rollno = 32;
        // System.out.println(s1.name);
        // System.out.println(s1.rollno);
    }
}
