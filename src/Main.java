import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Type a word: ");
        String word = reader.nextLine();

        System.out.println("Length of the first part: " + word.substring(0,4));
        System.out.println("Length of the first part: " + word.substring(0,6));

    }

}
