package Project1;

public class Task4 {
    public static void main(String[] args) {

        int [][] numbers={{3,5,7,9,13},
                {2,4,6,12,16,}};

        for (int i = 0; i < numbers.length ; i++) {

            for (int j = 0; j <numbers[i].length ; j++) {
                if(numbers[i][j]%2==0){
                    System.out.print(numbers[i][j]+" ");
                }

            }
            System.out.println();
        }





    }
}



