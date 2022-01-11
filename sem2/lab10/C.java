interface Hospital{
    public void center();
}

class AIIMS implements Hospital{
    String trauma, emergency, pathology, orthopedic;

    public void center(){
        System.out.println("Center name : AIIMS");
        System.out.println("Trauma center : "+trauma);
        System.out.println("Emergency center : "+emergency);
        System.out.println("Pathology center : "+pathology);
        System.out.println("Orthopedic center : "+orthopedic);
    }

    AIIMS(String trauma, String emergency, String pathology, String orthopedic){
        this.trauma = trauma;
        this.emergency = emergency;
        this.pathology = pathology;
        this.orthopedic = orthopedic;
    }

    // Copy Constructor
    AIIMS(AIIMS other){
        this.trauma = other.trauma;
        this.emergency = other.emergency;
        this.pathology = other.pathology;
        this.orthopedic = other.orthopedic;
    }

}
public class C {
    public static void main(String[] args) {
        AIIMS a1 = new AIIMS("A11", "D13", "B04", "C22");
        a1.center();

        // Copy Constructor in use
        AIIMS a2 = new AIIMS(a1);
        a2.center();
    }
}
