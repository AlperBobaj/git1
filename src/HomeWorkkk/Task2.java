package HomeWorkkk;

public class Task2 {
    public static void main(String[] args) {

        String[][]grocery={{"Tomato","Cucumber","Broccoli"},
                {"Apple","Banana","Orange"},
                {"Milk","Cheese"},
                {"Ice Cream","Chocolate",}};

        for (int i = 0; i < grocery.length ; i++) {
            for (int j = 0; j < grocery[i].length; j++) {
                System.out.print(grocery[i][j]+" ");


            }
            System.out.println();
        }
        System.out.println("-----");
        for(String[] store : grocery){
            for(String item : store){
                System.out.print(item+" ");
            }
            System.out.println();
        }
    }
}
