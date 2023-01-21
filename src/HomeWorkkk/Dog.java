package HomeWorkkk;

public class Dog {



    String name;
    String age;
    String color;

    void eat(){
        System.out.println("Loves to eat");}
void sleep(){
    System.out.println("Loves to sleep");
    }
    void play(){
        System.out.println("Loves to play");
    }

    public static class husky {

        public static void main(String[] args) {


            Dog Husky=new Dog();
            Husky.name="Milo";
            Husky.age="6";
            Husky.color="White";

            Husky.eat();
            Husky.sleep();
            Husky.play();

            Dog Bulldog=new Dog();
            Bulldog.name="Ace";
            Bulldog.age="4";
            Bulldog.color="black";

            Bulldog.eat();
            Bulldog.sleep();
            Bulldog.play();

            Dog Labrador=new Dog();
            Labrador.name="Eleven";
            Labrador.age="12";
            Labrador.color="Brown";

            Labrador.eat();
            Labrador.sleep();
            Labrador.play();


        }
    }
}



