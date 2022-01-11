import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[3];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Type element here :");
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        sc.close();
    }
}
