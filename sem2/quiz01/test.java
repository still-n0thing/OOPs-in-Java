public class test {
    public static void main(String[] args) {

        int result = 0, x = 1;
        while(x <= 10){
            if(x%2 == 0){
                result += x;
            }

            ++x;
        }
        System.out.println(result);
    }    
}
