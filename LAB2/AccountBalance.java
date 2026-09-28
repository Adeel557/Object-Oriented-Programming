package LAB2;

class Account{
    double balance;
    String acc_name;

    public Account(){
        balance= 500;
        acc_name= "Adeel";
    }

    public Account(double balance, String acc_name ){
        this.balance= balance;
        this.acc_name= acc_name;
    }

    public double deposit_money(double deposit_amount){
        if(deposit_amount > 0){
            balance += deposit_amount;
        }else{
            System.out.println("Deposit amount should be greater than 0");
        }
        return balance;
    }



    public double withdraw_money(double withdraw_amount){
        if(withdraw_amount < balance){
            balance -= withdraw_amount;
        }else{
            System.out.println("Withdraw amount should be less than balance");
        }
        return balance;
    }

    public void display(){
        System.out.println("LAB2.Account Name: " + acc_name+ "\nBalance in LAB2.Account: "+ balance);
    }

}

public class AccountBalance {
    public static void main(String[] args){
        Account a1= new Account();
        a1.display();
        System.out.println("Balance after withdraw: " +a1.withdraw_money(600));
        System.out.println("Balance after deposit: " +a1.deposit_money(500));
        System.out.println("Balance after withdraw: " + a1.withdraw_money(800));

        Account a2= new Account(100, "Umer");
        a2.display();
        System.out.println("Balance after withdraw: " +a2.withdraw_money(600));

    }
}

