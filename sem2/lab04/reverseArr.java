// code 03
// Write a Java program to reverse an array of integer values
import java.util.Scanner;
public class reverseArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type number(>=3) of elements here :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < arr.length; i++){
            System.out.print("Type "+i+"th element here :");
            arr[i] = sc.nextInt();
        }
        System.out.println("Input Array :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ (i != arr.length-1? " ": "\n"));
        }
        int temp = 0;
        for(int i = 0; i < n/2; i++){
            // Swap
            temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }
        System.out.println("Reversed Array :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ (i != arr.length-1? " ": "\n"));
        }
        sc.close();
    }
}
