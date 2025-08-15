package Arrays;// Java program to get string input and store it in an array, and print the concatenated string which is present in the even and odd index positions
import java.util.*;
public class EvenIndexString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of strings: ");
        int count = scanner.nextInt();
        System.out.println("Enter the names of the " + count + " fruits");
        String[] fruits = new String[count];
        int[] num=new int [count];
        for (int i = 0; i <count; i++) {
            fruits[i] = scanner.nextLine();
        }
        String strOdd="";
        String strEven="";
        for(int i =0;i<count;i++){
            if(i%2==0){
                strEven=strEven+fruits[i];
            }
            else{
                strOdd=strOdd+fruits[i];
            }
        }
        System.out.println("Elements at even index positions: "+strEven);
        System.out.println("Elements at odd index positions: "+strOdd);
    }
}
