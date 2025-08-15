package BasicOperations;
// Sum of factors of first number==Second original number and sum of factors of second number==
// First original number
import java.util.*;
public class AmicablePairs {
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int n1=sc.nextInt();
       int n2= sc.nextInt();
       int sum1=0;
       for(int i =1 ;i<n1;i++){
           if(n1%i==0){
               sum1+=i;
           }
       }
       int sum2=0;
       for(int i=1;i<n2;i++){
           if(n2%i==0){
               sum2+=i;
           }
       }
       result=sum1+sum2;
       System.out.println();
   }
}
