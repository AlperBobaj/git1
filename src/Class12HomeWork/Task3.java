package Class12HomeWork;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter Mom's name");
        String momName= scanner.next();
        System.out.println("Please enter Dad's name");
        String dadName= scanner.next();
        System.out.println("Is it a boy or a girl");
        String gender= scanner.next();


        String boy="Adam";
        String girl="Amelia";
        if(dadName.equals("Daniel") && momName.equals("Marry")){
            if(gender.equals("boy")){
                System.out.println("Suggested name is "+boy);
            }
            if(dadName.equals("Daniel") && momName.equals("Marry")){
                if(gender.equals("girl")){
                    System.out.println("Suggested name is"+girl);
                }


                }
        }
    }
}
