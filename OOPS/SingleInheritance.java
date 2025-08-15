package OOPS;
/*Inheritance concepts
Association - general relationship
Aggregation - whole part relationship , part is independent of each other
Combination - whole part , but dependent

Is - a relationship: inheritance is not dependent on the instance of other classes.
Has - a relationship:
 */
class Father{
    void house(){
        System.out.println("2 BHK House");
    }
}
class Son extends Father{
    void car(){
        System.out.println("7 seater Car");
    }
}
public class SingleInheritance {
    public static void main(String[] args){
        Father father=new Father();
        father.house();
        System.out.println("-----------");
        Son son= new Son();
        son.house();
        son.car();
    }
}
