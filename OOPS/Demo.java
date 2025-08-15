package OOPS;

public class Demo {
    public static void main(String[] args){
        This obj=new This();
    }
}
class This{
    This(){
        this(10);
        System.out.println("Default constructor called");
    }
    This(int n){
        System.out.println("Parameter constructor called"+n);
    }
}