// Code 02
// Write a Java program to compute the average value of an array of integers except the largest and smallest values
import java.util.Scanner;
public class avgValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type number(>=3) of elements here :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < arr.length; i++){
            System.out.print("Type "+i+"th element here :");
            arr[i] = sc.nextInt();
        }
        int low = Integer.MAX_VALUE, high = Integer.MIN_VALUE;
        int sums = 0;
        for(int i = 0; i < arr.length; i++){
            high = Math.max(arr[i], high);
            low = Math.min(arr[i], low);
            sums += arr[i];
        }
        double avg = (double)(sums - low - high)/(n-2);
        System.out.println("Average without highest and lowest :"+avg);
        sc.close();
    }
}
