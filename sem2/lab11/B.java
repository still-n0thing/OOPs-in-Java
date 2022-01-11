import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        int a = fs.nextInt();
        float b = fs.nextFloat();
        String c = fs.next();
        System.out.println("Output : "+a + " " + " " + b + " " + c);
    }

    static class FastScanner{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");
        
        // For String
        String next() {
            // Exception handling
            while (!st.hasMoreTokens())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        // For Int
        int nextInt() {
            return Integer.parseInt(next());
        }

        // For Float
        float nextFloat(){
            return Float.parseFloat(next());
        }

    }
}