public class code02 {
    public static void main(String[] args) {
        int a = 10, b = 20;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = "+a+" and b = "+b);
        
        // Works only if b != 0
        a = a*b;
        b = a/b;
        a = a/b;
        System.out.println("a = "+a+" and b = "+b);
    }
}
