class mythread1 implements Runnable {
    @Override
    public void run(){
        int a = 1, n = 10;
        for(int i = 1; i <= n; i++){
            a *= i;
        }
        System.out.println("Thread : " + Thread.currentThread().getName());
        System.out.println(n + "! = " + a);
    }
}

class mythread2 implements Runnable {
    @Override
    public void run(){
        int a = 0, n = 10;
        for(int i = 1; i <= n; i++){
            a += i;
        }
        System.out.println("Thread : " + Thread.currentThread().getName());
        System.out.println("Sum 1..10 = " + a);
    }
}

public class A {
    public static void main(String[] args) {
        mythread1 task1 = new mythread1();
        mythread2 task2 = new mythread2();
        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);
        t1.setName("task1");
        t2.setName("task2");
        t1.start();
        t2.start();
    }
}