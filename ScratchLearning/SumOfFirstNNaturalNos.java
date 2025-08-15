package ScratchLearning;
import java.sql.SQLOutput;
import java.util.*;
public class SumOfFirstNNaturalNos {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("The sum of first "+n+" natural numbers is "+sum);
    }
}
