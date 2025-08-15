package OOPS;

public class MethodOverriding {
    public static void main(String[] args){
        Dogs dog=new Dogs();
        Cat cat=new Cat();
        Animalss obj=new Dogs();
        obj.makeSound();
    }
}
class Animalss{
    void makeSound(){
        System.out.println("Some Sound");
    }
}
class Dogs extends Animalss{
    void makeSound(){
        System.out.println("Dog will bark");
    }
}
class Cat extends Animalss{
    void makeSound(){
        System.out.println("Cats will meow");
    }
}