package BasicOperations;//constant that arises when we take a 4-digit integer,
// form the largest and smallest numbers from its digits, and then subtract these two numbers
import java.util.*;
public class KaprekarNumber {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        int square=number*number;
        int divisor=1;
        boolean k=false;
        while(square/divisor>0){
            int leftpart=square/divisor;
            int rightpart=square%divisor;
            if(leftpart+rightpart==number){
                k=true;
            }
            divisor*=10;
        }
        if(k){
            System.out.println(number+" - Kaprekar number");
        }else{
            System.out.println(number+" - Not a kaprekar number");
        }
    }
}
