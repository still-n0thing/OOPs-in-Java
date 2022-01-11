public class B {
    public static void main(String[] args) {
        try {
            String str = null;
            if(str.equals("Dhaval")){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        catch(ArithmeticException ae){
            System.out.println("ArithmeticException Caught");
            System.out.println(ae);
        }
        catch(ArrayIndexOutOfBoundsException aiobe){
            System.out.println("ArrayIndexOutOfBoundsException Caught");
            System.out.println(aiobe);
        }
        catch(NullPointerException npe){
            System.out.println("NullPointerException Caught");
            System.out.println(npe);
        }
        catch(Exception e){
            System.out.println("Other Exception Caught");
            System.out.println(e);
        }
        finally{
            System.out.println("Program Executed normally");
        }
    }    
}