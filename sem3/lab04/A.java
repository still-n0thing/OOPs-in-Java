public class A {
    public static void main(String[] args) {
        // Finally cannot be used without a try block in java programming language
        
        // try-finally
        try {
            int a = 100;
            System.out.println("a = " + a);
        }
        finally{
            System.out.println("Running Fine ...\n");
        }

        // try-catch-finally
        int b;
        try {
            b = 20100/0;
            System.out.println("b = "+b);
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            b = 20100;
            System.out.println("b = "+b);
            System.out.println("Program Executed Correctly");
        }

    }    
}