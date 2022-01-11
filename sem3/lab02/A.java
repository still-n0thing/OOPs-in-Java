import java.time.*;

class Student {
    // Instance varibles
    private String name;
    private int rollno;
    private int dob_d;
    private int dob_m;
    private int dob_y;
    private String city;
    private int age;

    public Student(String name, int rollno, int d, int m, int y, String city, int age){
        this.name = name;
        this.rollno = rollno;
        this.dob_d = d;
        this.dob_m = m;
        this.dob_y = y;
        this.city = city;
        this.age = age;
    }

    public Student(){
        this(null, 0, 0, 0, 0, null, 0);
    }

    // Getter function
    public String getName(){
        return name;
    }
    public int getRollno(){
        return rollno;
    }
    public String getDob(){
        return String.valueOf(dob_d)+"/"+String.valueOf(dob_m)+"/"+String.valueOf(dob_y);
    }
    public String getCity(){
        return city;
    }

    // Setter function
    public void setName(String name){
        this.name = name;
    }
    public void setRollno(int rollno){
        this.rollno = rollno;
    }
    public void setDob(int d, int m, int y){
        this.dob_d = d;
        this.dob_m = m;
        this.dob_y = y;
    }
    public void setCity(String city){
        this.city = city;
    }


    // Age 
    public void age(){
        LocalDate today = LocalDate.now();  
        LocalDate birthday = LocalDate.of(dob_y, dob_m, dob_d);  
        Period p = Period.between(birthday, today);
        System.out.println("Age = "+p.getYears()+" years "+p.getMonths()+" months and "+p.getDays()+" days old");
    }

}

public class A {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Dhaval Kumar");
        s1.setRollno(201000013);
        s1.setDob(12, 11, 2002);
        s1.setCity("Durg");

        System.out.println("Name = "+s1.getName());
        System.out.println("Roll no = "+s1.getRollno());
        System.out.println("DOB = "+s1.getDob());
        System.out.println("City = "+s1.getCity());
        s1.age();
    }
}
