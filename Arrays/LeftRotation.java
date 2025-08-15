package Arrays;//java program to print left rotation of an array
import java.util.*;
public class LeftRotation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] num = {1, 2, 3, 4, 5, 6};
        System.out.print("Enter the number of rotations: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int j, firstElement;
            firstElement = num[0];
            for (j = 0; j <num.length - 1; j++) { //0<5 1<5 2<5 3<5 4<5
                num[j]=num[j+1]; // 0=1 1=2 2=3 3=4 4=5
            }
            num[j]=firstElement;
        }
        System.out.println("Array after "+n+" rotations is");
        for (int i =0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
    }
}