package OOPS;
class A{
    A(){
        super();
        System.out.println("in class A");
    }
    A(int n){
        super();
        System.out.println("in int Class A");
    }
}
class B extends A{
    B(){
        super();
        System.out.println("in class B");
    }
    B(int n){
        super(10);
        System.out.println("in int Class B");
    }
}
public class SuperDemo {
    public static void main(String[] args){
        B obj=new B(5);
    }
}
