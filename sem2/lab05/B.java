class person{
    int height;
    int weight;

    void update_fields(){
        height *= 2;
        weight *= 2;
    }

    person(int ht, int wt){
        height = ht;
        weight = wt;
    }

    void display(){
        System.out.println("height :"+height+" cm");
        System.out.println("weight :"+weight+" kg");
    }
}

public class B {
    public static void main(String[] args) {
        person p1 = new person(175, 70);
        System.out.println("Before update_fields");
        p1.display();
        p1.update_fields();
        System.out.println("After update_fields");
        p1.display();
    }
}
