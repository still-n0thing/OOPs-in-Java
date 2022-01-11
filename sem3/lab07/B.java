class GcdThread extends Thread {
    public int run(int a, int b){
        System.out.println("Thread : " + super.getName());
        if (b == 0){
            return a;
        }
        return run(b, a % b);
    }
}

public class B {
    public static void main(String[] args) {
        GcdThread gt1 = new GcdThread();
        gt1.start();
    }

    public int mod(int a, int b){
        System.out.println("Thread : " + "main");
        return a % b;
    }
}
