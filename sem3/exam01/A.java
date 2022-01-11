class Bank {
    String Name;
    int Roll_No;
    int Age;
    String Account_Number;
    String Account_Type;
    long Balance;

    void Create(String Name, int Roll_No, int Age, String Account_Number, String Account_Type){
        this.Name = Name;
        this.Roll_No = Roll_No;
        this.Age = Age;
        this.Account_Number = Account_Number;
        this.Account_Type = Account_Type;
        this.Balance = 1000;
        check();
    }

    void Deposit(long money){
        if(money > 100000){
            throw new RuntimeException("Deposit Limit is 100000rs");
        }
        this.Balance += money;
    }

    void Withdraw(long money){
        if(money > 50000 || this.Balance - money < 1000){
            throw new RuntimeException("Invalid Withdrawl");
        }
        this.Balance -= money;
    }

    void Display(){
        System.out.println("Name : " + Name);
        System.out.println("Roll No. : " + Roll_No);
        System.out.println("Age : " + Age);
        System.out.println("Account Number : " + Account_Number);
        System.out.println("Account Type : " + Account_Type);
        System.out.println("Balance : " + Balance + "rs\n");
    }

    void check(){
        if(Age <= 15 && Age >= 100){
            throw new ArithmeticException("Age should be > 15 and < 100");
        }

        if((Account_Number).length() != 11){
            throw new RuntimeException("Accounct number should be exactly 11 digits");
        }

        if( (!Account_Type.equals("C")) || (!Account_Type.equals("S"))){
            throw new RuntimeException("Accounct Type should be C or S");
        }
    }

}

public class A {
    public static void main(String[] args) {
        try {
            Bank account01 = new Bank();
            account01.Create("Dhaval", 201000013, 19, "12345678911", "C");
            account01.Display();

            account01.Deposit(100);
            account01.Display();

            account01.Withdraw(100);
            account01.Display();

            account01.Withdraw(60000);
        } catch (Exception e){
            System.out.println(e);
        } finally {
            System.out.println("Execution Completed");
        }       
    }
}