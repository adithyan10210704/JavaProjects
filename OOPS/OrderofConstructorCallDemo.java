package OOPS;
class X{
    X() {
        System.out.println("Inside X's constructor");
    }
}
class Y extends X{
    Y(){
        System.out.println("Inside Y's constructor");
    }
}
class Z extends Y{
    Z(){
        System.out.println("Inside Z's constructor");
    }
}
public class OrderofConstructorCallDemo {
}
