package Arrays;//Left rotation within a range
import java.util.Arrays;
public class Sample2 {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8,9};
        int k=2;
        int start=0;
        int end=4;
        rotateArray(arr,k,start,end);
        System.out.println(Arrays.toString(arr));
    }
    static void rotateArray(int[] arr,int k,int start, int end){
        for(int i=0;i<k;i++){
            int j,firstElement;
            firstElement=arr[0];
            for(j=start;j<end;j++){
                arr[j]=arr[j+1];
            }
            arr[j]=firstElement;
        }
    }
}
