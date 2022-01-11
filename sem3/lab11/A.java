import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class A {
    public static void main(String[] args) throws IOException {
        
        // Part - 01
        FileOutputStream fout = new FileOutputStream("inputA.txt");
        char c = 'c';
        fout.write((int)c);
        fout.close();

        // Part - 02
        FileInputStream fin = new FileInputStream("inputA.txt");
        boolean flag = false;
        int i;
        while((i=fin.read())!=-1){
            if((char)i == 'c'){
                flag = true;
            }
        }
        if(flag){
            System.out.println("'c' is present in file");
        } else {
            System.out.println("'c' is not present in file");
        }
        fin.close();
    }
}