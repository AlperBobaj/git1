package HomeWorkkk;

public class Task3 {

    public static void main(String[] args) {

        int[][] numbers={{7,1,3},
                         {3,23,5},
                         {12,7,8}};

        int sum=0;

        for(int[] num:numbers){
            for(int row:num){
                sum+=row;
            }
        }
        System.out.println(" The sum of numbers is " + sum);

            }

        }





