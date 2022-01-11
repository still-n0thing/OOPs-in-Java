import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner; 

public class A {
    public static void main(String[] args) throws IOException {
        FileOutputStream fout = new FileOutputStream("outputA.txt");
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Type the text fot the file :");
        String s = sc.nextLine();
        
        byte[] str_in_bytes = s.getBytes();
        fout.write(str_in_bytes);

        sc.close();
        fout.close();
    }
}