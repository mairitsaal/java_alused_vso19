import java.util.Scanner;
import java.util.Random;


public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Type a word: ");
        String text = reader.nextLine();


        System.out.println("In reverse order: " + reverse(text));

    }
    public static String reverse(String text) {
        String help = "";

        for(int i=text.length()-1; i>=0; i--){ //sõna lõppu
            help = help + text.charAt(i);
        }
        return help;
    }


}
