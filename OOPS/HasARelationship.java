package OOPS;

public class HasARelationship {
    public static void main(String[] args){
        Car car=new Car();
        car.carStart();
    }
}
class Engine{
    public void start(){
        System.out.println("Engine started");
    }
}
class Car{
    Engine engine=new Engine();
    void carStart(){
        engine.start();
        System.out.println("Car Started");
    }
}