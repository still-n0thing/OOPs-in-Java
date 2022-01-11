public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("1");
        try {
            System.out.print("2");
            int a = 100, b = 0, c;
            c = a/b;
            System.out.println("3");
            System.out.println(c);
        }
        catch (Exception e){
            System.out.println("4");
            System.out.println(e);
            System.out.println("5");
        }

        System.out.println("Program Executed Successfully");
    }
}
