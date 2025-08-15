package BasicOperations;//Sum of factors of first number==Second number+1 and
// Sum of factors of second number==First number+1
import java.util.*;
public class BetrothedPairs {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int number1=scanner.nextInt();
        int number2=scanner.nextInt();
        int sum1=0;
        for(int i=1;i<=number1/2;i++){
            if(number1%i==0){
                sum1+=i;
            }
        }
        int sum2=0;
        for(int i=1;i<=number2/2;i++){
            if(number2%i==0){
                sum2+=i;
            }
        }
        if(sum1==number2+1 && sum2==number1+1){
            System.out.println("Betrothed pairs");
        }else{
            System.out.println("Not Betrothed pairs");
        }
    }
}
