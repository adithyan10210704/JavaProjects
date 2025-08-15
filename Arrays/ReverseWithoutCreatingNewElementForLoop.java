package Arrays;//Java program to reverse an array without creating new element using for loop
import java.util.Arrays;
public class ReverseWithoutCreatingNewElementForLoop {
    public static void main(String[] args){
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int length = array.length;
        int end=length-1;
        for (int i = 0; i < length/2; i++) {
            int temp = array[i];
            array[i] = array[end ];
            array[end] = temp;
            end--;
        }
        System.out.println(Arrays.toString(array));
    }
}
