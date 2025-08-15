package Arrays;// Java program to right rotate an array given a starting and ending index
import java.util.Arrays;
import java.util.Scanner;

public class RightRotationRange {
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
            int last = arr[end];
            for (int i = end; i > start; i--) {
                arr[i] = arr[i - 1];
            }
            arr[start] = last;
        }

        System.out.println("Array after right rotation from index " + start + " to index " + end + " is " + Arrays.toString(arr));
    }
}