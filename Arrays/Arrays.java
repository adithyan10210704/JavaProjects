package Arrays;// Java program to store the element in an array by getting user input
//Arrays.Arrays - used to store elements of same data type
import java.util.*;
public class Arrays {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int count=scanner.nextInt();
        int[] arr=new int[count];
        for(int i =0;i<count;i++){
            arr[i]=scanner.nextInt();
        }
        for(int i=0;i<count;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
