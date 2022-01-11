class Student{
    String name;
    String branch;
    int rollno;

    Student(){
        // this() to invoke class constructor
        this("NA", "NA", -1);
    }
    
    Student(String name, String branch, int rollno){
        this.name = name;
        this.branch = branch;
        this.rollno = rollno;
    }

    void display(){
        System.out.println("Name :"+this.name);
        System.out.println("Branch :"+this.branch);
        System.out.println("Roll No. :"+this.rollno);
    }
}

public class C {
    public static void main(String[] args) {
        Student s1 = new Student("Dhaval Kumar", "CSE", 201000013);
        Student s2 = new Student();
        s1.display();
        System.out.print("\n");
        s2.display();
    }
}
