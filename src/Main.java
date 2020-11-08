import java.util.*;

    public class Main {
        public static void main(String[] args) {
            CashRegister unicafeExactum = new CashRegister();
            System.out.println( unicafeExactum );

            LyyraCard cardOfMairit = new LyyraCard(70);

            System.out.println("the card balance " +cardOfMairit.balance() + "euros");
            boolean succeeded = unicafeExactum.payGourmet(cardOfMairit);
            System.out.println("payment success: " + succeeded);

            unicafeExactum.loadMoneyToCard(cardOfMairit, 10);

            succeeded = unicafeExactum.payEconomical(cardOfMairit);
            System.out.println("payment success: "+ succeeded);

            System.out.println("the card balance " +cardOfMairit.balance() + "euros");

            System.out.println( unicafeExactum );
        }
    }