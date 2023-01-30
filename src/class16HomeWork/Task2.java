package class16HomeWork;

public class Task2 {

//    2) Create a method that will take a String as a parameter and returns reversed String.
//    Method should be available to all classes within your project and accessible by class name.


    public String reverse (String day) {

        StringBuilder rv=new StringBuilder(day);
        rv.reverse();
        return rv.toString();


    }


    public static void main(String[] args) {

        Task2 task2=new Task2();
        System.out.println(task2.reverse("Monday"));
    }

}
