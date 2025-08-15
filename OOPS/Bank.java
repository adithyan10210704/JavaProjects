package OOPS;

import java.sql.SQLOutput;

/*
    Create a class called GeneralBank that acts as base class for all banks. This class has
    getSavingsInterestRate and getFixedDepositInterestRate methods, which return the savings account
    interest rate and fixed deposit account interest rate that the specific bank gives.
    Since GeneralBank cannot say what percentage which bank would give, make these methods abstract.
    Create two subclasses of GeneralBank called ICICIBank and KotMBank. Override the inherited methods
    from the base class. The following are the interest rates of these banks:
    ICICIBank - Savings 4% Fixed 8.5%
    KotMBank - Savings 6% Fixed 9
    Create a main method to test the above classes and their methods. Try one by one and observe your
    findings
    a) ICICI Bank i = new ICICIBank();
    b) KotMBank k =new KotMBank();
    c)GeneralBank g= new KotMBank();
    d) GeneralBank g=new ICICIBank();
 */
public class Bank {
    public static void main(String[] args){
        KotMBank kotak=new KotMBank();
        ICICIBank icici=new ICICIBank();
        System.out.println("ICICI Bank");
        System.out.println("Interest for Savings: "+icici.getSavingsInterestRate()+" Interest for Fixed Deposit: "+icici.getFixedDepositInterestRate());
        System.out.println("-----------------------------");
        System.out.println("Kotak Mahindra Bank");
        System.out.println("Interest for Savings: "+kotak.getSavingsInterestRate()+" Interest for Fixed Deposit: "+kotak.getFixedDepositInterestRate());
        System.out.println("-----------------------------");
        GeneralBank icici1=new ICICIBank();
        GeneralBank kotak1=new KotMBank();
        System.out.println("ICICI Bank with General Bank reference");
        System.out.println("Interest for Savings: "+icici1.getSavingsInterestRate()+" Interest for Fixed Deposit: "+icici1.getFixedDepositInterestRate());
        System.out.println("-----------------------------");
        System.out.println("Kotak Mahindra Bank with General Bank reference");
        System.out.println("Interest for Savings: "+kotak1.getSavingsInterestRate()+" Interest for Fixed Deposit: "+kotak1.getFixedDepositInterestRate());
        System.out.println("-----------------------------");
    }
}
abstract class GeneralBank{
    abstract double getSavingsInterestRate();
    abstract double getFixedDepositInterestRate();
}
class ICICIBank extends GeneralBank{
    public double getSavingsInterestRate(){
        return 4;
    }
    public double getFixedDepositInterestRate(){
        return 8.5;
    }
}
class KotMBank extends GeneralBank{
    public double getSavingsInterestRate(){
        return 6;
    }
    public double getFixedDepositInterestRate(){
        return 12.2;
    }
}