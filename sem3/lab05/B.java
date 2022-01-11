import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int n = 10;
        int arr[] = new int[n];
        
        int check = 1, idx = 0;
        while(check == 1){
            System.out.print("Do you want to insert element (0 or 1):");
            check = sc.nextInt();
            if(idx < arr.length && check == 1){
                System.out.print("Type "+idx+"th element here :");
                arr[idx] = sc.nextInt();
                idx++;
            }
            else{
                throw new ArrayIndexOutOfBoundsException("Size of array is full");
            }
        }
        System.out.println("Array :");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}