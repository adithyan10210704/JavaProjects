package BasicOperations;
import java.util.Scanner;
// Java program to reverse a number
public class ReversingNumber {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int originalNum=num;
        int reversed=0;

        //Loop until number becomes 0
        while(num!=0){
            int digit=num%10;
            reversed=reversed*10+digit;
            num=num/10;
        }
        System.out.println("Reversed number is " + reversed);
    }
}

