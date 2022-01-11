interface Hospital{
    void centre();
}

class GovHospital implements Hospital {
    String trauma;
    String emergency;
    String pathology;
    String orthopedic;
    
    // Constructors
    public GovHospital(String t, String e, String p, String o){
        this.trauma = t;
        this.emergency = e;
        this.pathology = p;
        this.orthopedic = o;
    }

    // Copy Constructor
    public GovHospital(GovHospital other){
        this(other.trauma, other.emergency, other.pathology, other.orthopedic);
    }

    // Implementation
    public void centre(){
        System.out.println("Trauma    Centre = "+this.trauma);
        System.out.println("Emergency Centre = "+this.emergency);
        System.out.println("Pathology Centre = "+this.pathology);
        System.out.println("Othopedic Centre = "+this.orthopedic);
    }
}

public class B {
    public static void main(String[] args) {
        // Using normal Perimeterised constructor
        GovHospital gh1 = new GovHospital("Room no. A101","Room no. B201", "Room no. C301", "Room no. D401");
        
        // Using Copy Constructor
        GovHospital gh2 = new GovHospital(gh1);

        // Using center function
        gh1.centre();
        gh2.centre();
    }    
}
