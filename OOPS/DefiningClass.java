package OOPS;
/*
Defining a class in java
       - Class Employee
        -> Instance variables
            - id
            - name
            - salary
        -> Instance methods
            -setId(...)
            -setName(...)
            -setSalary(...)
            -getEmployeeDetails
 */
public class DefiningClass {
    public static void main(String[] args){
        Employee object= new Employee();
        object.setId(1);
        object.setName("ABC");
        object.setSalary(25000.00);
        object.displayEmployeeDetails();
    }
}
class Employee{
    int id;
    String name;
    double salary;
    void setId(int i){
        id=i;
    }
    void setName(String  n){
        name=n;
    }
    void setSalary(double s){
        salary=s;
    }
    void displayEmployeeDetails(){
        System.out.println("Name: "+name);
        System.out.println("Employee ID: "+id);
        System.out.println("Salary: "+salary);
    }
}
