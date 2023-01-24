package Project1;

public class Task5 {
    public static void main(String[] args) {

        int[][] arr = {{2, 3, 5, 45, 2},
                {0, 10, 11, 14},
                {33, 31, 27, 89}


        };
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 == 0) {
                    sumEven = arr[i][j] + sumEven;
                } else if (arr[i][j] % 2 != 0) {
                    sumOdd = arr[i][j] + sumOdd;

                }

            }

        }
        System.out.println(" Total of even number are " + sumEven);
        System.out.println(" Total of odd number are " + sumOdd);
    }
}