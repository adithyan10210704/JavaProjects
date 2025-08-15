package OOPS;

public class IsARelationship {
    public static void main(String[] args){
        Honda car=new Honda();
        car.drive();
        car.speed();
    }
}
class car{
    void drive(){
        System.out.println("Will Drive Car");
    }
}
class Honda extends car{
    void speed(){
        System.out.println("It is a high speed car");
    }
}