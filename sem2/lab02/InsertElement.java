import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];

        for (int i = 0; i < 5; i++) {
            System.out.print("Type element " + i +" here :");
            a[i] = sc.nextInt();
        }
        System.out.println("Before update array :");
        for (int i = 0; i < 5; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println(" ");
        System.out.println("Type new element and position :");
        int element = sc.nextInt();
        int pos = sc.nextInt();
        for (int i = 6; i > pos; i--) {
            a[i] = a[i-1];
        }
        a[pos] = element;
        System.out.println("Updated array :");
        for (int i = 0; i < 6; i++) {
            System.out.print(a[i]+" ");
        }
        sc.close();
    }
}
