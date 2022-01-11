class Employee{
    String name;
    int salary;
    String status;
    String permanentAddress;
    String officeAddress;
    
    Employee(String name, int salary, String pA, String oA){
        this.name = name;
        this.salary = salary;
        this.permanentAddress = pA;
        this.officeAddress = oA;
        if(salary > 80000){
            this.status = "Rank A officer";
        }
        else if (salary > 50000 && salary <= 80000){
            this.status = "Rank B officer";
        }
        else if(salary > 30000 && salary <= 50000){
            this.status = "Rank C officer";
        }
        else if(salary > 15000 && salary <= 30000){
            this.status = "Rank D officer";
        }
        else{
            this.status = "Rank E officer";
        }
    }

    void display(){
        System.out.println("Name : "+name);
        System.out.println("Salary : "+salary);
        System.out.println("Status : "+status);
        System.out.println("Permanent Address : "+permanentAddress);
        System.out.println("Office Address : "+officeAddress);
    }

}

public class D {
    public static void main(String[] args) {
        Employee e1 = new Employee("Rajesh Kumar", 90000, "Durg", "Raipur");
        Employee e2 = new Employee("Ravi Singh", 40000, "Delhi", "Mumbai");
        e1.display();
        System.out.print("\n");
        e2.display();
    }
}
