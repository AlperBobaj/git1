package HomeWorkkk;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {

        String[][] countries = {{"Usa", "Canada", "Cuba"},
                {"Brazil", "Argentina", "Colombia"},
                {"Germany", "France", "Spain"},
                {"Thailand", "South Korea", "Japan"},
                {"Nigeria", "Ghana", "Morocco"}
        };

        int count=0;
        for (String[]  one:countries){
            System.out.println(Arrays.toString(one));

            System.out.println("-------");
            for (int i = 0; i <countries.length ; i++) {
                System.out.println(Arrays.toString(countries[i]));
                for (int j = 0; j <countries[i].length ; j++) {
                    count++;

                }
            }
            System.out.println("The number of countries are"+count);

            }
        }
    }
