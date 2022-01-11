// (c) Performing multiple task from multiple thread
class SomeThread1 extends Thread {
    public void run(){
        System.out.println("SomeThread1 : Performing multiple task from multiple thread (" + Thread.currentThread().getName()+")");
    }
}

class SomeThread2 extends Thread {
    public void run(){
        System.out.println("SomeThread2 : Performing multiple task from multiple thread (" + Thread.currentThread().getName()+")");
    }
}

public class A3 {
    public static void main(String[] args) {
        SomeThread1 t1 = new SomeThread1();
        SomeThread2 t2 = new SomeThread2();

        t1.start();
        t2.start();
    }
}