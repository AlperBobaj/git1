package HomeWorkkk;

public class Task {

    public static void main(String[] args) {

       // Create a 2D array(shorter way)

         String[][] students={{"Alper","Florin","Rinor","Meriton"},
                 {"A","B","C","D"},} ;

        for (int i = 0; i < students.length ; i++) {
            for (int j = 0; j < students.length ; j++) {
                if(students[i][j].equals("A") && students[i][j].equals("B")){

                }
                System.out.println(students[0][j]);
            }

        }

    }
}
