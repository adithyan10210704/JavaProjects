package Arrays;// Java program to print the elements present in the even index position
import java.util.*;
public class EvenIndexPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Elements at even index positions:");
        for (int i = 0; i < count; i += 2){
            System.out.println(arr[i]);
        }
    }
}