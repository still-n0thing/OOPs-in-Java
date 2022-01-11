class School_Student{
    public String name;
    public int rollno;

    void display(){
        System.out.println("Name : "+name);
        System.out.println("Roll No. : "+rollno);
    }
}

public class A {
    public static void main(String[] args) {
        School_Student s1 = new School_Student();
        s1.display();
        s1.name = "Dhaval";
        s1.rollno = 201000013;
        s1.display();
    }    
}
