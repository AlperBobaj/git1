package class20HomeWork;

public class Employee {
    //2. Create an Employee class that will have variables and methods. Constructor that should initialize instance variables
    //Create 2 subclasses FullTime and PartTime Employees that should have own variables and methods.
    //Create a Tester Subclass from FullTime Employee and add some features and methods to the Tester Class.
    //Test your code!

    String name;
    String salary;
    int id;

    Employee(String name,String salary,int id){
        this.name=name;
        this.salary=salary;
        this.id=id;
    }
    void info(){
        System.out.println("employee id is"+id+"hes name is"+name+"and hes salary is"+salary);
    }
}
class FullTime extends Employee{

    int hours;
    FullTime(String name,String salary,int id){
        super(name, salary, id);
        this.hours=hours;
    }
    void FullTimeInfo(){
        System.out.println(name+"is a full time employee");
    }
}
class ParTime extends FullTime{

    int hours;
    ParTime(String name,String salary,int id){
        super(name, salary, id);
        this.hours=hours;

    }
    void PartTimeInfo(){
        System.out.println(name+"is a par time employee");
    }
}