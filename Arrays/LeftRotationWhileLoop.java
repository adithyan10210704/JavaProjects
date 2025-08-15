package Arrays;

import java.util.*;
import java.util.Arrays;
public class LeftRotationWhileLoop {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int[] arr={1,2,3,4,5,6};
        System.out.print("Enter the number of rotations: ");
        int k=scanner.nextInt();
        rotateArray(arr,k);
        System.out.println("The array after left rotating "+k+" times is " + Arrays.toString(arr));
    }
    static void rotateArray(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the starting index: ");
        int start = scanner.nextInt();
        System.out.print("Enter the ending index: ");
        int end = scanner.nextInt();
        reverseArray(arr,0,end);
    }
    static void reverseArray(int[] arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
