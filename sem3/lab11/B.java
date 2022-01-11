import java.io.IOException;
import java.io.FileInputStream;

public class B {
    public static void main(String[] args) throws IOException {
        FileInputStream fin = new FileInputStream("inputB.txt");
        int i, cnt = 0;
        System.out.println("Content of inputB.txt : ");
        while((i=fin.read())!=-1){
            cnt++;
            System.out.print((char)i);
        }
        System.out.println("\n\nChar count : "+cnt);
        fin.close();
    }
}
