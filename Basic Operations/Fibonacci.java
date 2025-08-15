package BasicOperations;

import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of terms from the user
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        int first = 0, second = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}