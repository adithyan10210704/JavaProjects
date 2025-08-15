package Recursion;
// Java program to find the factorial of a number using recursive function
import java.sql.SQLOutput;
import java.util.*;
public class Factorial {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        int result=fact(n);
        System.out.println(result);
    }
    public static int fact(int i){
        if(i>0){
            return i*fact(i-1);
        }
        else{
            return 1;
        }
    }
}
