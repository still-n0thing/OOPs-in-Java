public class B extends Thread {
    public void run(){
        System.out.println("getName() : " + Thread.currentThread().getName());
        Thread.currentThread().setName("My_Thread");
        System.out.println("Using setName()");
        System.out.println("getName() : " + Thread.currentThread().getName());
        System.out.println("Thread Running...");
    }

    public static void main(String[] args) {
        B t1 = new B();
        t1.start();
        System.out.println("isAlive() : " + t1.isAlive());
    }    
}
