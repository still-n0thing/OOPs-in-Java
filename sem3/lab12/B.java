import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class B {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String inFile, outFile, someOutFile;
        
        System.out.print("Type the input file name : ");
        inFile = sc.nextLine();
        
        System.out.print("Type the output file name : ");
        outFile = sc.nextLine();

        System.out.print("Type the output file name : ");
        someOutFile = sc.nextLine();
        
        FileInputStream fin = new FileInputStream(inFile);
        FileOutputStream fout = new FileOutputStream(outFile);
        FileOutputStream fout2 = new FileOutputStream(someOutFile);

        int some_char;
        while ((some_char = fin.read()) != -1) {
            fout.write(some_char);
            fout2.write(some_char);
        }

        System.out.println("Copying of contents completed.");

        sc.close();
        fin.close();
        fout.close();
        fout2.close();
    }
}