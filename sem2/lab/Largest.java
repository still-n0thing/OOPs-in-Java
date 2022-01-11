import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type 3 numbers here :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int largest = (a > b)?a:(b>c?b:c);
        System.out.println("Largest :"+largest);
        sc.close();
    }
}
