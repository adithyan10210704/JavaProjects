package Arrays;//Java program to get two-dimensional array input from user and print it
import java.util.*;

public class TwoDimensionalArray {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows= scanner.nextInt();
        System.out.println("Enter the number of columns");
        int columns=scanner.nextInt();
        int[][] array=new int[rows][columns];
        System.out.println("Enter the elements");
        for(int i=0;i<rows;i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        for(int i =0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
