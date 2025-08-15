package SituationalProblems;
/*
Given a maximum of 100-digit numbers as input, find the difference between the sum of the odd and even
position digits.
Case 1:
    Input: 4567    ( 4+6 - 7+5 = |-2| = 2 )
    Output : 2
Case 2:
    Input : 9834698765123
    Output: 1
 */
import java.util.*;
public class OddlyEven {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String num=sc.next();
        long oddSum=0,evenSum=0;
        for(int ind = 0;ind<num.length();ind++){
            if(ind%2==0)
                oddSum=oddSum +(long) (num.charAt(ind)-'0');
            else
                evenSum=evenSum+(long)(num.charAt(ind)-'0');
        }
        long diff=Math.abs(oddSum-evenSum);
        System.out.println(diff);
    }
}
