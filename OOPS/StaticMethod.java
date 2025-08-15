package OOPS;

public class StaticMethod {
    private static int a = 0;
    private int b;
    public void set(int i, int j) {
        a = i;
        b = j;
    }
    public void show() {
        System.out.println("This is a static a: " + a);
        System.out.println("This is non-static b: " + b);
    }
    public static void main(String[] args) {
        StaticMethod x = new StaticMethod(); // First object
        StaticMethod y = new StaticMethod(); // Second object
        x.set(1, 1);
        x.show();
        y.set(2, 2);
        y.show();
        x.show();
    }
}