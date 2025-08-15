package Arrays;//java program to reverse an array without creating new elements
import java.util.Arrays;
public class ReverseWithoutCreatingNewElement {
    public static void main(String[] args){
        int[] array={1,2,3,4,5,6,7,8,9};
        int start=0;
        int end=array.length-1;
        while(start<end){
            int temp=array[start];
            array[start]=array[end];
            array[end]=temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(array));
    }
}
