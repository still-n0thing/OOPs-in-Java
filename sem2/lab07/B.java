import java.util.Scanner;

class Student{
    int rollno;
    String name;
    String branch;
    int year;
    double grade;
    
    Student(int r, String n, String b, int y, double g){
        rollno = r;
        name = n;
        branch = b;
        year = y;
        grade = g;
    }
    Student(Student s){
        rollno = s.rollno;
        name = s.name;
        branch = s.branch;
        year = s.year;
        grade = s.grade;
    }

}

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3;
        Student stdarr[] = new Student[n];  
        int r; String na; String b; int y; double g;
        double lw = 11, high = 0;
        double gr = 0;
        for (int i = 0; i < stdarr.length-1; i++) {
            System.out.print("Type Student details here:");
            System.out.print("Roll no :");
            r = sc.nextInt();
            System.out.print("Name :");
            na = sc.nextLine();
            System.out.print("Branch :");
            b = sc.nextLine();
            System.out.print("Year :");
            y = sc.nextInt();
            System.out.print("Grade :");
            g = sc.nextDouble();
            stdarr[i] = new Student(r, na, b, y, g);
            gr += g;
            if(lw > g){
                lw = g;
            }
        }

        // 2
        System.out.println("Type extra student with higheest grade");
        System.out.println("Type Student details here:");
        System.out.println("Roll no :");
        r = sc.nextInt();
        System.out.print("Name :");
        na = sc.nextLine();
        System.out.print("Branch :");
        b = sc.nextLine();
        System.out.print("Year :");
        y = sc.nextInt();
        System.out.print("Grade :");
        g = sc.nextDouble();
        stdarr[2] = new Student(r, na, b, y, g);
        gr += g;
        gr = gr/n;
        high = g;
        int avg = 0, min = 0, max = 0;
        for (int i = 0; i < stdarr.length; i++) {
            if(stdarr[i].grade == gr){
                avg++;
            }
            if(stdarr[i].grade == lw){
                min++;
                // Lowest Marks
                System.out.println("Lowist marks: "+ stdarr[i].name);
            }
            if(stdarr[i].grade == high){
                max++;
            }

        }

        // Copy Constructor
        Student s1 = new Student(stdarr[0]);

        System.out.println("No. min :" + min);
        System.out.println("No. max :" + max);
        System.out.println("No. avg :"+avg);
        sc.close();  
    }
}

