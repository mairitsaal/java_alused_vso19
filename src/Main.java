import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("What is your name: ");
        String name = reader.nextLine();

        char character = name.charAt(0);

        System.out.println("1. character: " + character);
        char character2 = name.charAt(1);
        System.out.println("2. character: " + character2);
        char character3 = name.charAt(2);
        System.out.println("3. character: " + character3);

    }

}
