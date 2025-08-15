package Arrays;
//java program to find the maximum sum of sub array of size 3
public class MaxSumofSubArray {
    public static void main(String[] args){
        int arr[]={10,12,1,14,15,65,23,47};
        int k=3;
        int maxSum=0;
        for(int i=0;i<k;i++){
            maxSum+=arr[i];
        }
        int Sum =maxSum;
        for(int i =k;i<arr.length;i++){
            Sum +=arr[i]-arr[i-k];
            if(Sum >maxSum){
                maxSum= Sum;
            }
        }
        System.out.println("The maximum sum of sub array of size "+k+" is : "+maxSum);
    }
}
