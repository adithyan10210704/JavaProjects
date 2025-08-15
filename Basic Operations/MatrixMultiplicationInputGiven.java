package BasicOperations;

//Java program to do multiply two matrices given the inputs
public class MatrixMultiplicationInputGiven {
    public static void main(String[] args){
        int[][] matrix1={{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrix2={{1,2,3},{4,5,6},{7,8,9}};
        int[][] result=new int[matrix1.length][matrix1[0].length];
        for(int i=0;i<matrix1.length;i++){
            for(int j =0;j<matrix1[0].length;j++){
                result[i][j]=matrix1[i][j]*matrix2[i][j];
            }
        }
        for(int i=0;i<result.length;i++){
            for(int j=0;j<result[0].length;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}
