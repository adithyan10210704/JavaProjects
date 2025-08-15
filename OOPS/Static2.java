package OOPS;

public class Static2 {
    private static int a=0;
    private int b;
    public void set( int i,int j){
        a=i;
        b=j;
    }
    public void show(){
        System.out.println("Static a: "+a);
        System.out.println("Non static b: "+b);
    }
    public static void main(String[] args){
        Static2 obj1=new Static2();
        Static2 obj2=new Static2();
        obj1.set(1,1);
        obj1.show();
        obj2.set(2,2);
        obj2.show();
        obj1.show();
    }
}
