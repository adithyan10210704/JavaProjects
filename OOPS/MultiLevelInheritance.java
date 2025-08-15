package OOPS;
class Grandfather{
    void land(){
        System.out.println("2 Acre Land");
    }
}
class Parent extends Grandfather{
    void house(){
        System.out.println("2 BHK House");
    }
}
class Child extends Parent{
    void car(){
        System.out.println("7 seater Car");
    }
}
public class MultiLevelInheritance {
    public static void main(String[] args){
        Parent parent =new Parent();
        parent.house();
        parent.land();
        System.out.println("-----------");
        Child child=new Child();
        child.house();
        child.car();
        child.land();
    }
}
