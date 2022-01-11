import java.util.Scanner;

class ATM{
    int money = 0;
    
    ATM(int money){
        this.money = money;
    }

    void withdraw(int amount){
        if(amount > money){
            System.out.println("Not enough balance");
            checkBalance();
        }
        else{
            money -= amount;
        }
        
    }

    void deposit(int amount){
        money += amount;
    }

    void checkBalance(){
        System.out.println("Current Balance : "+money);
    }

    void printSystem(){
        System.out.println("Choose 1 for Withdraw");
        System.out.println("Choose 2 for Deposit");
        System.out.println("Choose 3 for Check Balance");
        System.out.println("Choose 4 for EXIT");
    }
}


public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ATM atm1 = new ATM(0);
        int choice, amount;
        boolean flag = true;
        while(flag){
            atm1.printSystem();
            choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.print("Type the amount to be withdrawn : ");
                    amount = sc.nextInt();
                    atm1.withdraw(amount);
                    break;
                case 2:
                    System.out.print("Type the amount to be deposited : ");
                    amount = sc.nextInt();
                    atm1.deposit(amount);
                    break;
                case 3:
                    atm1.checkBalance();
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    break;
              }
        }
        sc.close();
    }
}
