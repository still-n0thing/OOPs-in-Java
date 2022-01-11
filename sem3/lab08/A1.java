// (a) Performing single task from single thread
public class A1 extends Thread {
    public void run(){
        System.out.println("Performing single task from single thread");
    }

    public static void main(String[] args) {
        A1 t1 = new A1();
        t1.start();
    }
}