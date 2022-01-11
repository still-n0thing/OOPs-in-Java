import java.time.LocalDate;
import java.time.Period;

class Student{
    private String name;
    private int roll;
    private int day;
    private int month;
    private int year;
    private String city;
    private int age;

    

    Student(String n, int r, int d, int m, int y, String c, int a){
        name = n;
        roll = r;
        day = d;
        month = m;
        year = y;
        city = c;
        age = a;
    }

    // getters
    String getName(){
        return name;
    }

    int getRoll(){
        return roll;
    }

    int getDay(){
        return day;
    }

    int getMonth(){
        return month;
    }

    int getYear(){
        return year;
    }

    String getCity(){
        return city;
    }

    int getAge(){
        return age;
    }

    // Setters
    void setName(String name){
        this.name = name;
    }

    void setRoll(int roll){
        this.roll = roll;
    }

    void setDay(int day){
        this.day = day;
    }

    void setMonth(int month){
        this.month = month;
    }

    void setYear(int year){
        this.year = year;
    }

    void getCity(String city){
        this.city = city;    
    }

    void setAge(int age){
        this.age = age;
    }

    // Age 
    void curAge(){
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(year, month , day);  
        Period p = Period.between(birthday, today);
        System.out.println("Current age : "+ p.getYears() + " years " + p.getMonths() + " months " + p.getDays() + " days old"); 
    }

    void display(){
        System.out.println("Name : "+name);
        System.out.println("Roll no :"+roll);
        System.out.println("Data of Birth : "+day+"/"+month+"/"+year);
        System.out.println("City : "+city);
        System.out.println("Age : "+age);
        System.out.print("\n");
    }
}

public class C {
    public static void main(String[] args) {
        Student s1 = new Student("Dhaval Kumar", 201000013, 12, 11, 2002, "Durg", 18);        
        s1.display();
        s1.curAge();
    }
}
