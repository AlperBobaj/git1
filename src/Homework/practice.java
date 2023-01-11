package Homework;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 3 distinct numbers");
        int number = input.nextInt();
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        if (number > 5) {
            System.out.println("The largest number is " + number);
        } else if (number1 > 5) {
            System.out.println("The largest number is " + number);
        } else {
            System.out.println("The largest number is " + number);
        }

    }
}

