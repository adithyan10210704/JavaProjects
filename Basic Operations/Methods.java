package BasicOperations;

public class Methods {
    public static void main(String[] args){
        add();
        sub(90,54);
        System.out.println(mul());
        int divi=div(60,20);
        System.out.println(divi);
    }
    public static void add(){ //No return type without parameter
        int a=10;
        int b=20;
        System.out.println(a+b);
    }
    public static void sub(int a ,int b){ // No return type with parameter
        System.out.println(a-b);
    }
    public static int mul(){ //Return type with parameter
        return 10*10;
    }
    public static int div(int a ,int b){// Return type with parameter
        return a/b;
    }
}
