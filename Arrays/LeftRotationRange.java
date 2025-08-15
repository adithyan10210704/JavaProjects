package Arrays;

import java.util.Arrays;
import java.util.Scanner;
public class LeftRotationRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.print("Enter the starting index: ");
        int start = scanner.nextInt();
        System.out.print("Enter the ending index: ");
        int end = scanner.nextInt();
        System.out.print("Enter the number of rotations: ");
        int rotations = scanner.nextInt();
        int rangeLength = end - start + 1;
        rotations = rotations % rangeLength;
        for (int r = 0; r < rotations; r++) {
            int first = arr[start];
            for (int i = start; i < end; i++) {
                arr[i] = arr[i + 1];
            }
            arr[end] = first;
        }
        System.out.println("Array after left rotation from index " + start + " to index " + end + " is " + Arrays.toString(arr));
    }
}