package HomeWorkk;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayHomeWork1 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter 5 numbers");
        int [] numbers=new int[5];
        numbers[0]=12;
        numbers[1]= 22;
        numbers[2]= 33;
        numbers[3]= 44;
        numbers[4]= 56;

        for (int i = 0; i < numbers.length ; i++) {
            numbers[i]= scanner.nextInt();

        }
        System.out.println(Arrays.toString(numbers));

    }
}


