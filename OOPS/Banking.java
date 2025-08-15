package OOPS;
// Java program for banking purpose in order to deposit an amount and withdraw the amount if minimum balance is more than 5000 or return insufficient balance.
public class Banking {
    public static void main(String[] args){
        Accounts acc=new Accounts();
        acc.deposit(50000);
        acc.withdraw(10000);
    }
}
class Accounts{
    double balance;
    double minBalance;
    void deposit(int amount){
        balance+=amount;
        System.out.println("Balance amount in your account: "+balance);
    }
    void withdraw(int amount){
        int minBalance=5000;
        if(amount>minBalance){
            balance-=amount;
            System.out.println("Balance amount in your account after withdrawal: "+balance);
        }else{
            System.out.println("Insufficient balance in your account");
        }
    }
}
