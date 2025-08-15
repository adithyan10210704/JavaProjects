package Arrays;

import java.util.Arrays;
public class RemoveRepeatingNumbers {
    public static void main(String[] args){
        int[] num={1,2,2,3,3,4,4,};
        System.out.println(Arrays.toString(num));
        int j=0;
        int[] temp=new int[num.length-1];
        for(int i =0;i<num.length-1;i++){
            if(num[i]!=num[i+1]){
                temp[j++]=num[i];
            }
        }
        temp[j]=num[num.length-1];
        int length=j+1;
        int arr[]=new int[length];
        for(int i =0;i<length;i++){
            arr[i]=temp[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
