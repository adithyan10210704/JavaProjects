package BasicOperations;//PIN=((Max digit of input1 x min digit of input1) +(
// Max digit of input2 x min digit of input2)+(max digit of input 3 x min digit of input 3))
// -input4
import java.util.*;
public class SecretPIN {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int input1=scanner.nextInt();
        int input2=scanner.nextInt();
        int input3=scanner.nextInt();
        int input4=scanner.nextInt();
        if(input1<1000||input1>9999||input2<1000||input2>9999||input3<1000||input3>9999||input4<1000||input4>9999){
            System.out.println("Inputs must have only 4 -digits");
            return;
        }
        int max1 = 0, min1 = 9;
        int number = input1;
        while (number > 0) {
            int digit = number % 10;
            max1 = Math.max(max1, digit);
            min1 = Math.min(min1, digit);
            number /= 10;
        }
        int max2 = 0, min2 = 9;
        number = input2;
        while (number > 0) {
            int digit = number % 10;
            max2 = Math.max(max2, digit);
            min2 = Math.min(min2, digit);
            number /= 10;
        }
        int max3 = 0, min3= 9;
        number = input3;
        while (number > 0) {
            int digit = number % 10;
            max3 = Math.max(max3, digit);
            min3 = Math.min(min3, digit);
            number /= 10;
        }
        int pin=(max1*min1)+(max2*min2)+(max3*min3)-input4;
        System.out.println(pin);
    }
}
