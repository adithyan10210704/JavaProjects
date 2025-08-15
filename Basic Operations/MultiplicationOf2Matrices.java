package BasicOperations;//Java program to find the multiplication of two matrices
import java.util.*;
public class MultiplicationOf2Matrices {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows of first matrix");
        int row1 = scanner.nextInt();
        System.out.println("Enter the number of columns of first matrix");
        int col1 = scanner.nextInt();
        System.out.println("Enter the number of rows of second matrix");
        int row2 = scanner.nextInt();
        System.out.println("Enter the number of columns of second matrix");
        int col2 = scanner.nextInt();
        int[][] matrix1 = new int[row1][col1];
        int[][] matrix2 = new int[row2][col2];
        int[][] result = new int[row1][col2];
        System.out.println("Enter elements of 1st matrix");
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                System.out.println("Element at [ " +i+"]["+j+"]:");
                matrix1[i][j]=scanner.nextInt();
            }
        }
        System.out.println("Enter elements of 2nd matrix");
        for(int i =0;i<row2;i++){
            for(int j =0;j<col2;j++){
                System.out.println("Element at [ " +i+"]["+j+"]:");
                matrix2[i][j]=scanner.nextInt();
            }
        }
        for(int i=0;i<row1;i++){
            for(int j=0;j<col2;j++){
                for(int k=0;k<col1;k++){
                    result[i][j]+=matrix1[i][k]*matrix2[k][j];
                }
            }
        }
        System.out.println("The resulting matrix is: ");
        for(int i=0;i<row1;i++){
            for(int j=0;j<col2;j++){
                System.out.print(result[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
