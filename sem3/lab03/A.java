public class A {
    public static void main(String[] args) {
        try{
            int c = 10/0;
            System.out.println(c);
        }
        catch(ArithmeticException ae){
            System.out.println("ArithmeticException");
            System.out.println(ae+"\n");
        }

        try{
            int d = Integer.parseInt("Dhaval");
            System.out.println(d+"\n");
        }
        catch(NumberFormatException nfe){
            System.out.println("NumberFormatException");
            System.out.println(nfe+"\n");
        }

        try{
            int array[] = { 1, 2, 3, 4, 5 };
            System.out.println(array[5]);
        }
        catch(ArrayIndexOutOfBoundsException aiobe){
            System.out.println("ArrayIndexOutOfBoundsException");
            System.out.println(aiobe+"\n");
        }

        try{
            String str = null;
            if(str.equals("Dhaval")){
                System.out.println("Job done");
            }
            else{
                System.out.println("Job Incomplete");
            }
        }
        catch(NullPointerException npe){
            System.out.println("NullPointerException");
            System.out.println(npe);
        }
    }
}
