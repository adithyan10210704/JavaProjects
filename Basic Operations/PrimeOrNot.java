package BasicOperations;

import java.util.*;
public class PrimeOrNot {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        if(number<=1){
            System.out.println("Not prime");
            return;
        }
        for(int i=2;i<number;i++){
            if(number%i==0){
                System.out.println("Not prime");
                return;
            }
        }
        System.out.println("Prime number");
    }
}
