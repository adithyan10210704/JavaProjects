package OOPS;
/*
    Create a base class Fruit with name, taste and size as its attributes.
    Create a method called eat() which describes the name of the fruit and its taste
    Inherit the same in 2 other classes Apple and Orange and override the eat() method to represent each
    fruit taste.
 */
public class FruitBasket {
    public static void main(String[] args){
        Fruit fruit=new Fruit();
        Apple apple=new Apple();
        apple.name="Apple";
        apple.taste="Fruit";
        apple.size=250;
        Orange orange=new Orange();
        orange.taste="Tangy and Sweet";
        orange.size=150;
        apple.eat();
        System.out.println("------------------------------------------------------");
        orange.eat();
    }
}
class Fruit{
    String name;
    String taste;
    int size;
    void eat(){
        System.out.println("Name of the fruit: "+name+" taste: "+taste+" size: " +size);
    }
}
class Apple extends Fruit{
    void eat(){
        System.out.println("Name of the fruit:+ "+name+" taste: "+taste+" size: " +size);
    }
}
class Orange extends Fruit{
    void eat(){
        System.out.println("Name of the fruit:+ "+name+" taste: "+taste+" size: " +size);
    }
}
