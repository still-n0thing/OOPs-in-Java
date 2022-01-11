class box {
    int l; int h; int w;

    void display(){
        System.out.println(l+" "+h+" "+w);
    }
}
public class test {

    public static void main(String[] args) {
        box b2 = new box();
        box b1 = new box();
        b1.l = 1;
        b1.h = 2;
        b1.w = 3;
        b2 = b1;
        b2.display(); 
    }
}
