package BasicOperations;//Java program to print the 3 largest numbers of an array
import java.util.*;
public class ThreeLargestNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        if (n < 3) {
            System.out.println("Array should have at least 3 elements.");
            return;
        }
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nTop 3 largest numbers:");
        for (int i = n - 3; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}





