import java.util.Scanner;

public class OddandEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numbere of element in array :");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Type element " + i +" here :");
            a[i] = sc.nextInt();
        }
        System.out.println("Array :");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println(" ");

        int odd = 0, even = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]%2 == 0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Number of odds = "+odd+"\n"+"Number of evens = "+even);
        sc.close();
    }
}
