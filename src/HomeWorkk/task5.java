package HomeWorkk;

public class task5 {
    public static void main(String[] args) {

        int[] num=new int[5];
        num[0]=10;
        num[1]=15;
        num[2]=20;
        num[3]=25;
        num[4]=30;
        int sum=0;
        for (int i = 0; i < num.length ; i++) {

            sum=sum+num[i];

        }
        System.out.println(sum);
    }
}
