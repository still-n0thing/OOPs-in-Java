class Employee{
    // instance variable
    String name;
    // Static variable
    static String company = "Google";
    int salary;

    // Default Constructor
    Employee(){
        // This keyword
        this("NA", -1);
    }

    // Parameterised Constructor
    Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    void display(){
        System.out.println("Name : "+this.name);
        System.out.println("Salary : "+this.salary);
        System.out.println("Company : "+company);
        System.out.print("\n");
    }

    // Static method
    static void setCompany(String newCompany){
        company = newCompany;
    }

}

public class B {
    public static void main(String[] args) {
        // Local Variable
        String name = "Benjamin Wo";
        Employee e1 = new Employee();
        Employee e2 = new Employee(name, 50000);
        e1.display();
        e2.display();
        Employee.setCompany("Facebook");
        Employee e3 = new Employee("William Lin", 50000);
        e3.display();
    }
}
