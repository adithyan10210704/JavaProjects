package BasicOperations;

import java.util.*;
public class PerfectNoRange {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the lower limit");
        int lower=scanner.nextInt();
        System.out.println("Enter the upper limit");
        int upper=scanner.nextInt();
        for (int number = lower;number <= upper; number++) {
            int sum = 0;
            for (int i = 1; i <= number / 2; i++) {
                if (number % i == 0) {
                    sum += i;
                }
            }
            if (sum == number && number != 0) {
                System.out.println(number);
            }
        }
    }
}
