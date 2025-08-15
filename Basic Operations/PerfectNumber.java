package BasicOperations;
/*
A perfect number is a positive integer that equals the sum of its proper divisors
(the positive divisors excluding the number itself). For example, the number 6 is a perfect
number because its proper divisors are 1, 2, and 3, and 1 + 2 + 3 = 6.
 */
import java.util.*;
public class PerfectNumber {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        int sum=0;
        for(int i=1;i<number;i++){
            if(number%i==0){
                sum+=i;
            }
        }
        if(sum==number){
            System.out.println("Perfect number");
        }
        else{
            System.out.println("Not a perfect number");
        }
    }
}