package Class13HomeWork;

public class Task6 {
    public static void main(String[] args) {

         String name="Alper";
         String Lastname="Bobaj";
        System.out.println("Before swaping name string " +name+ " with a string " +Lastname);

        name=name+Lastname;
        Lastname=name.substring(0,name.length()-Lastname.length());
        name=name.substring((Lastname.length()));
        System.out.println("Before swaping name string " +name+ " with a string " +Lastname);
    }
}
