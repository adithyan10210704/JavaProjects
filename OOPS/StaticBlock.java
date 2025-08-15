package OOPS;

public class StaticBlock {
    static{
        System.out.println("I am inside Static Block 1");
    }
    public static void main(String[] args){
        System.out.println("I am inside Main method");
    }
    static {
        System.out.println("I am inside Static Block 2");
    }
}
