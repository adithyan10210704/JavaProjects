package OOPS;

interface barks{
    void bark();
}
class Animal{
    void eat(){
        System.out.println("Animals will Eat");
    }
}
class Dog extends Animal implements barks{
    @Override
    public void bark(){
        System.out.println("Dog will bark");
    }

}
public class HybridInheritance {
    public static void main(String[] args){
        Dog o=new Dog();
        o.bark();
        o.eat();
    }
}
