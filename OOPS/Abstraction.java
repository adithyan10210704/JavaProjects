package OOPS;

public class Abstraction {
    public static void main(String[] args){
    B1 obj=new B1();
    obj.draw();
    obj.ruler();
    }
}
abstract class A1{
    abstract void draw();
    public void ruler() {
        System.out.println("I am a ruler");
    }
}
class B1 extends A1{
    public void draw(){
        System.out.println("Draw the shape");
    }
}