package OOPS;
// Constructor - used to instantiate an object, cannot be called manually.

public class ConstructorExample {
    public static void main(String[] args){
        Student s1= new Student(100,"Prabhu");
        Student s2=new Student(s1);
        System.out.println("Name: "+s1.name+"ID: "+s1.id);
        System.out.println("Name: "+s2.name+"ID: "+s2.id);
    }
}
class Student{
    int id ;
    String name;
    Student(int id,String name){
        this.id=id;
        this.name=name;
    }
    Student(Student obj){
        this.id=obj.id;
        this.name=obj.name;
    }
}
