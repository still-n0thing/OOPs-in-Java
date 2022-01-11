class mythread01 extends Thread {
    public void run(){
        System.out.println("User created thread");
    }
}

public class A {
    public static void main(String[] args) {
        System.out.println("Thread.MAX_PRIORITY : " + Thread.MAX_PRIORITY);
        System.out.println("Thread.MIN_PRIORITY : " + Thread.MIN_PRIORITY);
        System.out.println("Thread.NORM_PRIORITY : " + Thread.NORM_PRIORITY);
        
        // For main thread
        System.out.println("\n" + "Thread : " + Thread.currentThread().getName());
        System.out.println("Priority : "+Thread.currentThread().getPriority());

        // For thread-0
        mythread01 t1 = new mythread01();
        t1.start();
        System.out.println("\n" + "Thread : " + t1.getName());
        System.out.println("Priority : " + t1.getPriority());
    }    
}