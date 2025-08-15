package OOPS;

public class StaticVariable1 {
    public static void main(String[] args){
        Mobile obj1=new Mobile();
        Mobile obj2=new Mobile();
        obj1.name="Samsung";
        obj1.price=50000;
        obj1.type="Android";

        obj2.name="Iphone";
        obj2.price=100000;
        obj2.type="iOS";

        Mobile.type="Phone";
        obj1.display();
        System.out.println("-------------");
        obj2.display();
    }
}
class Mobile{
    String name;
    int price;
    static String type;
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Price: "+price);
        System.out.println("Type: "+type);
    }
}