package Class15HomeWork;

public class Task6 {
    //6)Create  class Student that will have a method getGrade. Your method should accept the score of a student and return a grade:
    //score > 90 - A
    //score >80 - B
    //score >70 - C
    //score > 50 - D
    //anything else - F

    String grade(int score) {
        if (score > 90) {
            return "grade is A";
        } else if (score > 80) {
            return "grade is B";

        } else if (score > 70) {
            return "grade is C";

        } else if (score > 50) {
            return "grade is D";
        } else {
            return "grade is F";
        }
    }


    public static void main(String[] args) {
        Task6 task = new Task6();
        System.out.println(task.grade(95));
    }
}