final class Student1{
    final String Occupation = "Student";
    int age;
    String subject;

    Student1(int a, String sub){
        age = a;
        subject = sub;
    }

    final void display(){
        System.out.println("Occupation :"+ Occupation);
        System.out.println("Age :"+ age);
        System.out.println("Subject :"+ subject);
    }
}

// Error : 1 Cannot extend final class 
class Person1 extends Student1{

    // Error : 2 Connot override final method
    void display(){
        System.out.println("Type : Person");
    }
}

public class D {
    public static void main(String[] args) {
        Student1 s = new Student1(18, "PCM");
        
        s.display();

        // Error : 3 cannot change the value of final variable
        s.Occupation = "College Student";
    }
}
