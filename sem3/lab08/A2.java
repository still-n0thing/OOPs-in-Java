// (b) Performing single task from multiple thread
public class A2 extends Thread {
    public void run(){
        System.out.println("Performing single task from multiple thread");
    }
    
    public static void main(String[] args) {
        A2 t1 = new A2();
        A2 t2 = new A2();
        A2 t3 = new A2();

        t1.start();
        t2.start();
        t3.start();
    }
}