class Tesla{
    Tesla(){
        System.out.println("Brand : Tesla");
    }

    void vehicalType(){
        System.out.println("Type : Car");
    }
}

class ModelS extends Tesla{
    ModelS(){
        System.out.println("Model : S");
    }

    void maxSpeed(){
        System.out.println("Max Speed : 0-60 mph in 1.99 seconds");
    }
}

class ModelE extends Tesla{
    ModelE(){
        System.out.println("Model : S");
    }

    void maxSpeed(){
        System.out.println("Max Speed : 0-90 mph in 1.99 seconds");
    }
}

public class C {
    public static void main(String[] args) {
        ModelE me1 = new ModelE();
        me1.vehicalType();
        me1.maxSpeed();
        ModelS ms1 = new ModelS();
        ms1.vehicalType();
        ms1.maxSpeed();
    }
}
