import java.util.Scanner;

class ASCII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type achar here :");
        char s = sc.next().charAt(0);
        int val = (int)s;
        System.out.println("ASCII val :"+val);
        sc.close();
    }    
}
