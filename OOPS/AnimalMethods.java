package OOPS;

/* Create a class named ' Animal ' which includes methods like eat() and sleep(). Create a child class
    of animal named 'Bird' and override the parent class methods. Add a new method named fly().
    Create an instance of animal class and invoke the eat and sleep methods using this object.
    Create an instance of bird class and invoke the eat,sleep and fly methods using this object.
 */
class Animals {
    public void eat() {
        System.out.println("The animal is eating.");
    }
    public void sleep() {
        System.out.println("The animal is sleeping.");
    }
}
class Bird extends Animals {
    @Override
    public void eat() {
        System.out.println("The bird is pecking at some seeds.");
    }
    @Override
    public void sleep() {
        System.out.println("The bird is sleeping in its nest.");
    }
    public void fly() {
        System.out.println("The bird is flying high in the sky.");
    }
}
public class AnimalMethods {
    public static void main(String[] args) {
        Animals animals = new Animals();
        animals.eat();
        animals.sleep();
        Bird bird = new Bird();
        bird.eat();
        bird.sleep();
        bird.fly();
    }
}