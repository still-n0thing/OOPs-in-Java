class SomeThread extends Thread {
    public int p_val;

    SomeThread(int val){
        this.set(val);
    }

    public void set(int val){
        this.p_val = val;
    }

    public void run(){
        Thread.currentThread().setPriority(p_val);
        System.out.println(
            "\nThread : "+Thread.currentThread().getName() + 
            "\n" + "Priority : "+Thread.currentThread().getPriority() + 
            "\n" + "Execution Complete"
            );
    }

}

public class B {
    public static void main(String[] args) {
        for(int i = 7; i >= 1; i--){
            SomeThread t = new SomeThread(i);
            t.start(); 
        }
    }
    
}