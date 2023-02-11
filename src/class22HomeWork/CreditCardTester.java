package class22HomeWork;

public class CreditCardTester {
    public static void main(String[] args) {



        CreditCard card=new CreditCard(1300,4);
        card.calculateInterest();
        Visa v=new Visa(1200,2);
        v.calculateInterest();
        AX x=new AX(1000,3);
        x.calculateInterest();

    }


}
