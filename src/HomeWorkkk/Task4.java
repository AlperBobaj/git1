package HomeWorkkk;

public class Task4 {
    public static void main(String[] args) {

        int[][] num={{2,12,11,33},
                {4,33,22,15},
                {55,5,76,9} };
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j <num[i].length ; j++) {
                if(num[i][j]%2==0){
                    System.out.print(num[i][j]+" ");
                }
            }

        }
        System.out.println();
        System.out.println("----");
        for(int[] nums:num){
            for( int even : nums){
                if(even % 2==0){
                    System.out.println(even+" ");
                }


            }

        }
    }
}
