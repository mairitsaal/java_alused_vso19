import java.util.*;


public class Main {
    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(100);

        Menu cafee = new Menu();
        LyyraCard card = new LyyraCard(50);

        System.out.println(card);
        card.payEconomical();
        System.out.println(card);
        card.payGourmet();
        System.out.println(card);
        card.loadMoney(300);
        System.out.println(card);

        LyyraCard cardPekka = new LyyraCard(20);
        LyyraCard cardBrian = new LyyraCard(30);

        cardPekka.payGourmet();
        cardBrian.payEconomical();
        System.out.println("Pekka: The card has" + cardPekka+ " euros");
        System.out.println("Brian: The card has" + cardBrian+ " euros");
        cardPekka.loadMoney(20);
        cardBrian.payGourmet();
        System.out.println("Pekka: The card has" + cardPekka+ " euros");
        System.out.println("Brian: The card has" + cardBrian+ " euros");
        cardPekka.payEconomical();
        cardPekka.payEconomical();
        cardBrian.loadMoney(50);
        System.out.println("Pekka: The card has" + cardPekka+ " euros");
        System.out.println("Brian: The card has" + cardBrian+ " euros");

    }
}



