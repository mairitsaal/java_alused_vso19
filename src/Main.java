import java.util.*;

    public class Main {
        public static void main(String[] args) {
            CashRegister unicafeExactum = new CashRegister();

            double theChange = unicafeExactum.payEconomical(40);
            System.out.println("the change was " + theChange );

            theChange = unicafeExactum.payEconomical(5);
            System.out.println("the change was "  + theChange );

            theChange = unicafeExactum.payGourmet(4);
            System.out.println("the change was "  + theChange );

            System.out.println( unicafeExactum );

            LyyraCard cardOfMairit = new LyyraCard(70);

            boolean succeeded = unicafeExactum.payGourmet(cardOfMairit);
            System.out.println("payment success: " + succeeded);
            succeeded = unicafeExactum.payEconomical(cardOfMairit);
            System.out.println("payment success: "+ succeeded);
            succeeded = unicafeExactum.payEconomical(cardOfMairit);
            System.out.println("payment success: "+ succeeded);

            System.out.println( unicafeExactum );
        }
    }