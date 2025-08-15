package OOPS;

public class Encapsulation {
    public static void main(String[] args){
        Employees emp=new Employees();
        emp.setName("ABC");
        emp.setAge(20);
        System.out.println("Name: "+emp.getName());
        System.out.println("Age: "+emp.getAge());
    }
}
class Employees{
    private String name;
    private int age;

    //setter and getter method
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        if(age>0)
            this.age=age;
        else
            this.age=0;
    }
    public int getAge(){
        return age;
    }
}
