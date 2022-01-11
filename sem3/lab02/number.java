public class number {
    public static void main(String[] args) {
        number.operations obj1 = new number().new operations();
        obj1.display1(6);
        obj1.display2(6, 5051);

    }   

    // Inner Class
    public class operations{
        void display1(int n){
            if(n == 0){
                n = 1;
            }
            int ans = 1;
            for(int i = 1; i <= n; i++){
                ans *= i;
            }
            System.out.println(n+"! = "+ans);
        }
        void display2(int n, int a){
            if(n == 0){
                n = 1;
            }
            int ans = 1;
            for(int i = 1; i <= n; i++){
                ans *= i;
            }
            System.out.println(n+"! + "+a+" = "+(ans+a));
        }
    } 
}
