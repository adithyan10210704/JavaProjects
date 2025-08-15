package ScratchLearning;
import java.util.*;
public class SwitchCase {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        int b= sc.nextInt();
        sc.nextLine();
        System.out.println(" 1 - addition ,2 - subraction , 3- multiplication, 4- modulo, 5 - division");
        String operation =sc.nextLine();
        switch(operation){
            case "+" :
                System.out.println(a+b);
            break;
            case "-" :
                System.out.println(a-b);
                break;
            case "*" :
                System.out.println(a*b);
                break;
            case "%" :
                System.out.println(a%b);
                break;
            case "/" :
                System.out.println(a/b);
                break;
            default:
                System.out.println("Invalid operation");
        }
    }
}
