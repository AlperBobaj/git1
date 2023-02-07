package class20HomeWork;

public class Shape {

    //1. Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class.
    // In circle class create a method to calculate the area of circle. Test your code

    int radius;

    Shape(int radius){
        this.radius=radius;
    }

    }



     class circleClass extends Shape{

    double total=0;

    circleClass(int radius ){
        super(radius);
        total=(radius*radius)*3.14;

        }


    void areaOfCircle(){
        System.out.println("the area of the circle with a radius"+radius+"is "+total+"square inch");

    }

     }