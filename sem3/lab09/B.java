import java.lang.Thread;

class SomeThread1 extends Thread {
    public void run(){
        System.out.println("Thread : " + Thread.currentThread().getName());
        int a = 2;
        for(int i = 1; i <= 10; i++){
            try {
                Thread.sleep(1000);
            } catch (Exception e){
                System.out.println(e);
            }
            System.out.println(a + " * " + i + " = " + (a*i));
        }
    }
}

class SomeThread2 extends Thread {
    public void run(){
        System.out.println("Thread : " + Thread.currentThread().getName());
        int a = 1;
        for(int i = 1; i <= 10; i++){
            try {
                Thread.sleep(1000);
            } catch (Exception e){
                System.out.println(e);
            }
            a *= i;
            System.out.println(i + " ! = "+ a);
        }
    }
}

class SomeThread3 extends Thread {
    public void run(){
        System.out.println("Fast Thread Running");
    }
}

public class B {
    public static void main(String[] args) {
        SomeThread1 t1 = new SomeThread1();
        SomeThread2 t2 = new SomeThread2();
        SomeThread3 t3 = new SomeThread3();
        t1.start();
        t2.start();
        t3.start();
        t1.yield();
        t2.yield();
        System.out.println(Thread.currentThread().getName());
        System.out.println("t1.isAlive() : " + t1.isAlive());
        System.out.println("t2.isAlive() : " + t2.isAlive());
        System.out.println("t3.isAlive() : " + t3.isAlive());
    }    
}