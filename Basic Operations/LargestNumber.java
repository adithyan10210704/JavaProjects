package BasicOperations;//Java program to find the largest number in an array
import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int count = scanner.nextInt();
        int[] arr = new int[count];
        System.out.println("Enter " + count + " integers:");
        for (int i = 0; i < count; i++) {
            arr[i] = scanner.nextInt();
        }
        int temp = arr[0];
        for (int i = 1; i < count; i++) {
            if (arr[i] > temp) {
                temp = arr[i];
            }
        }
        System.out.println("The largest number in the array is : " + temp);
    }
}