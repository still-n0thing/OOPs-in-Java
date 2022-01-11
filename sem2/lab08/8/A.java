public class A {
    public static void main(String[] args) {
        int x = 0;
        System.out.println("Factorial of "+x+" = "+A.factorial(x));  
        x = 9;
        System.out.println("Factorial of "+x+" = "+A.factorial(x));
        x = -1;
        System.out.println("Factorial of "+x+" = "+A.factorial(x));      
    }

    static int factorial(int n){
        if(n < 0){
            System.out.println("Invalid input to factorial function");
            return -1;
        }
        else{
            if(n == 0) n = 1;
            int ans = 1;
            for(int i = 1; i <= n; i++){
                ans *= i;
            }
            return ans;
        }
    }
}
