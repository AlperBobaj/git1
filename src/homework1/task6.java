package homework1;

public class task6 {
    public static void main(String[] args) {

        String [] country={"Germany","Turkey","Usa","France","Austria","Spain"};
        for (int i = 0; i < country.length ; i++) {
            switch (country[i]){
                case "USA":

                    System.out.print("The capital of "+country[0]+ "is Berlin");
                    break;
                case"Turkey":

                    System.out.print("The capital of "+country[1]+ "is Ankara");
                    break;
                case"Usa":

                    System.out.print("The capital of "+country[2]+ "is Washington DC");
                    break;
                case"France":

                    System.out.print("The capital of "+country[3]+ "is Paris");
                    break;
                case "Austria":

                    System.out.print("The capital of "+country[4]+ "is Vienna");
                    break;
                case "Spain":

                    System.out.print("The capital of "+country[5]+ "is Madrid");
            }
            System.out.println();
        }
    }
}
