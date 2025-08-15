package ScratchLearning;
/*
 1
 0 1
 1 0 1
 0 1 0 1
 1 0 1 0 1



 To do this, use matrix, where it is a 5x5 matrix, (1,1)->1 , (2,1)->2, (2,2)->3, etc. Sum of x&y -> even = 1, sum of x and y -> odd =0
 */
public class Pattern9 {
    public static void main(String[] args){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print(1+" ");
                }else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }
}
