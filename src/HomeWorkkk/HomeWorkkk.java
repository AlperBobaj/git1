package HomeWorkkk;

public class HomeWorkkk {
    public static class Phone {

       // 1) Create a Class “Phone”. Create 3 Objects of it: iPhone, Pixel, Samsung with specific  attributes and behaviors.


               String name;
               String version;
               String color;
               int price;
               String weight;

                       void camera(){
                           System.out.println("Take picture`");
                       }
                       void alarm (){
                           System.out.println("Set an alarm");
                       }
                       void fold(){
                           System.out.println("Iphone has a big screen");
                       }
    }

    public static class Phone1 {
        public static void main(String[] args) {


            Phone phone1=new Phone();
            phone1.name="Iphone";
            phone1.version="Iphone14";
            phone1.color="white";
            phone1.price=1250;
            phone1.weight="165 gram";


            phone1.camera();
            phone1.alarm();
            phone1.fold();

            Phone phone2=new Phone();
            phone2.name="Pixel";
            phone2.version="Pixel pro";
            phone2.color="black";
            phone2.price=850;
            phone2.weight="175 gram";

            phone2.camera();
            phone2.alarm();
            phone2.fold();


            Phone phone3=new Phone();
            phone3.name="Samaung";
            phone3.version="Galaxy";
            phone3.color="black";
            phone3.price=1359;
            phone3.weight="170 gram";

            phone3.camera();
            phone3.alarm();
            phone3.fold();

        }
    }
}
