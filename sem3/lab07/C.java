public class C implements Runnable {
    public static void main(String[] args) {
        C t1 = new C(16, 5);

        System.out.println("Thread : Thread-main");
        t1.gcd_display(16, 12);

        System.out.println("\nThread : Thread-0");
        new Thread(t1).start();
    }
    
    public int a;
    public int b;

    public C(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int gcd(int a, int b){
        if (b == 0){
            return a;
        }
        return gcd(b, a % b);
    }

    public void gcd_display(int a, int b){
        System.out.println("gcd(" + this.a + ", " + this.b + ") = " + gcd(a, b));
    }
 
    public void run() {
        System.out.println(a + " % " + b + " = " + (a%b));
    }

 }
