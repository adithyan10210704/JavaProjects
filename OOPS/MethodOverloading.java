package OOPS;

public class MethodOverloading {
    public static void main(String[] args){
        Calculations obj=new Calculations();
        System.out.println(obj.add(13.5,45.8));
        System.out.println(obj.add(6.5,13));
        System.out.println(obj.add(10,20));
        System.out.println(obj.add(10,20,30));
    }
}
class Calculations {
    public int add(int a ,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
    public double add(double a, int b){
        return a+b;
    }
    public double add(double a ,double b){
        return a+b;
    }
}
