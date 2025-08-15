package Arrays;//java program to sort the array in the ascending order
import java.util.*;
public class Ascending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int count = scanner.nextInt();
        int[] arr = new int[count];
        int temp;
        System.out.println("Enter " + count + " integers:");
        for (int i = 0; i < count; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("Array in ascending order: ");
        for (int i = 0; i < count-1; i++) {
            System.out.print(arr[i] + " , ");
        }
        System.out.println(arr[count-1]);
        System.out.println();
    }
}