// Code 01
// Write a Java program to find the second largest element in an array
import java.util.Scanner;
public class secondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type number(>=2) of elements here :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < arr.length; i++){
            System.out.print("Type "+i+"th element here :");
            arr[i] = sc.nextInt();
        }
        int largest = Math.max(arr[0], arr[1]), secondlargest = Math.min(arr[0], arr[1]);
        for(int i = 2; i < arr.length; i++){
            if(arr[i] > largest){
                secondlargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > secondlargest){
                secondlargest = arr[i];
            }
        }
        System.out.println("2nd Largest element :"+secondlargest);
        sc.close();
    }
}
