package Arrays;

import java.util.Arrays;
import java.util.*;
public class RightRotation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] num = {1, 2, 3, 4, 5, 6};
        System.out.print("Enter the number of rotations: ");
        int n = scanner.nextInt();
        int len = num.length;
        for (int i = 0; i < n; i++) {
            int j, lastElement;
            lastElement = num[len - 1];
            for (j = len - 1; j > 0; j--) {
                num[j] = num[j - 1];
            }
            num[0] = lastElement;
        }
        System.out.println(Arrays.toString(num));
    }
}