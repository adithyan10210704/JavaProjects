package Arrays;
//Sliding window algorithm
import java.util.Arrays;
public class SlidingWindow {
    public static void main(String[] args){
        int[] arr={1,2,40,3,4,5,6,7,8,9,10,11};
        int size=3;
        int windowSum=0;
        int maxSum=0;
        int start=0;
        for(int i =0;i<size;i++){
            windowSum+=arr[i];
        }
        for(int end=size;end<arr.length;end++){
            windowSum=windowSum-arr[start]+arr[end];
            maxSum=Math.max(maxSum,windowSum);
            start++;
        }
        System.out.println(maxSum);
    }
}
