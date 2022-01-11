import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A {
    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Do we need to calcalute the sum (y/n):");
        try {
            String ans = in.readLine();

            while(!ans.equals("y") && !ans.equals("n")){
                System.out.println("Type (y/n) :");
                ans = in.readLine();
            }
    
            while(ans.equals("y")){
                func(in);
                System.out.println("Do we need to calcalute the sum (y/n):");
                ans = in.readLine();
                
                while(!ans.equals("y") && !ans.equals("n")){
                    System.out.println("Type (y/n) :");
                    ans = in.readLine();
                }
                
            }
        } catch (NumberFormatException nfe){
            System.out.println(nfe);
        } catch (IOException ioe){
            System.out.println(ioe);
        } catch (Exception e){
            System.out.println(e);
        } finally {
            System.out.println("End of Program");
        }
    }

    public static void func(BufferedReader in) throws IOException{
        // Calculate the sum of a sequence
        int ttl = 0, buf;

        System.out.println("Input a sequence of ints (terminated by 0) :");

        try{
            String stream = in.readLine();
            if(stream.matches("-?\\d+")){
                buf = Integer.parseInt(stream);
            } else {
                throw new NumberFormatException("Illegal operation to convert char to int");
            }
            
            while(buf != 0){
                ttl += buf;
                stream = in.readLine();
                if(stream.matches("-?\\d+")){
                    buf = Integer.parseInt(stream);
                } else {
                    throw new NumberFormatException("Illegal operation to convert char to int");
                }
            }
        } catch (NumberFormatException nfe){
            System.out.println(nfe);
        } catch (IOException ioe){
            System.out.println(ioe);
        } catch (Exception e){
            System.out.println(e);
        }

        System.out.println("Sum = " + ttl);
    }

}