class employee{
    // Static Data Member
    static String organization = "IIITNR";
    
    // Data Memebers
    String name;
    int age;
    int joining_year;

    // Default constructor
    employee(){
        this("Bijoy", 45, 2020);
    }

    // Parameterized Constructor
    employee(String name, int age, int joining_year){
        this.name = name;
        this.age = age;
        this.joining_year = joining_year;

    }

    // Methods
    void display(){
        System.out.println("Name : "+this.name);
        System.out.println("Age : "+this.age);
        System.out.println("Joining Year : "+this.joining_year);
    }

    void leap_year(){
        boolean check = false;
        int year = this.joining_year;
        if(year%400 == 0){
            check = true;
        }
        else if (year%100 == 0){
            check = false;
        }
        else if(year%4 == 0){
            check = true;
        }

        if(check){
            System.out.println("Joining Year "+this.joining_year+" is a leap year");
        }
        else{
            System.out.println("Joining Year "+this.joining_year+" is not a leap year");
        }
    }

    void check_age(){
        if(this.age%2 == 0){
            System.out.println("Age "+this.age+" is even\n");
        }
        else{
            System.out.println("Age "+this.age+" is odd\n");
        }
    }

}

// Inherititng parent class : employee
class employee_derived extends employee{
    employee_derived(){
        super();
    }
    employee_derived(String name, int age, int joining_year){
        // Accessing data memer of parent class
        super.name = name;
        super.age = age;
        super.joining_year = joining_year;
    }
}

public class A {
    public static void main(String[] args) {
        employee e1 = new employee();
        employee e2 = new employee("Dhaval Kumar", 19, 2020);
        
        e1.display();
        e1.leap_year();
        e1.check_age();

        e2.display();
        e2.leap_year();
        e2.check_age();

        employee_derived ed1 = new employee_derived();
        employee_derived ed2 = new employee_derived("Shyam Agrawal", 20, 2019);

        ed1.display();
        ed1.leap_year();
        ed1.check_age();

        ed2.display();
        ed2.leap_year();
        ed2.check_age();

        // Accessing data member of parent class in a instance of child class
        System.out.println(ed2.name);
        
    }
}
