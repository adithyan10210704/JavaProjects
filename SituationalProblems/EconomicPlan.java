package SituationalProblems;
/*
A telecom provider SmartConnect offers two different postpaid plans - Silver and Gold. Each plan has
different rate structures based on the time of day : Peak hours, evening and late night.
Breakdown:
    Silver Plan :
        Peak hours ( 6am - 6pm ) - First 120 minutes free, after that ₹0.30/minute
        Evening ( 6pm - 10pm ) - ₹0.20 /min
        Late night ( 10pm - 6am ) - ₹0.15/min
    Gold Plan:
        Peak hours ( 6am - 6pm ) - First 200 minutes free, after that ₹0.40/minute
        Evening ( 6pm - 10pm ) - ₹0.40 /min
        Late night ( 10pm - 6am ) - ₹0.20/min
A customer wants to compare which plan is more cost-effective based on their monthly usage. Write a
program to calculate the total charges for both Silver and gold plans based on given usage and display
which one is more economical.

Sample input :
    250 [ Peak hour usage in min ]
    100 [ Evening usage in min]
    80 [ Late night usage in min ]
Sample output :
    Total cost under silver plan : 71 rs
    Total cost under gold plan : 66 rs
    Therefore gold plan is more cost-effective.
 */
import java.util.*;
public class EconomicPlan {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int peak =sc.nextInt();
        int eve = sc.nextInt();
        int night=sc.nextInt();
        float silverAmt, goldAmt;
        silverAmt = (eve * 0.20f) + (night * 0.15f);
        goldAmt=(eve * 0.30f) + (night * 0.20f);
        if(peak > 120)
            silverAmt = silverAmt + (peak - 120) * 0.30f;
        if(peak>200)
            goldAmt = goldAmt + (peak - 200) * 0.40f;
        System.out.printf("Total cost under Silver Plan : Rs.%.2f\n",silverAmt);
        System.out.printf("Total cost under Gold Plan : Rs.%.2f\n",goldAmt);
        if (silverAmt> goldAmt)
            System.out.println("Gold Plan is economical.");
        else if (silverAmt<goldAmt)
            System.out.println("Silver Plan is economical.");
        else
            System.out.println("Both plans cost the same.");
    }
}
