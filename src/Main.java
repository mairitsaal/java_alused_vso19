import java.util.*;


public class Main {
    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(100);

        Menu cafee = new Menu();

        cafee.addMeal("Hamburger");
        cafee.addMeal("Fish'n'Chips");
        cafee.addMeal("Sauerkraut");

        cafee.printMeals();
        cafee.printMeals();
        cafee.printMeals();
        cafee.clearMenu();


        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.reset();
        counter.printValue();

        counter.setInitial();
        counter.printValue();
    }
}



