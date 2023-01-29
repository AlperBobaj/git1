package Class15HomeWork;

public class Task4 {

    //4)Create a method that will say Hello in different language based on the country that will passed when method is executed

    String language(String translate) {
        if (translate.equalsIgnoreCase("England")) {
            return "Hello";
        } else if (translate.equalsIgnoreCase("Albania")) {
            return "Ckemi";

        } else if (translate.equalsIgnoreCase("Spain")) {
            return "Hola";

        } else {
            return "Don't recognize the country";
        }
    }


    public static void main(String[] args) {
        Task4 task=new Task4();
        System.out.println(task.language("Germany"));
        }
    }





