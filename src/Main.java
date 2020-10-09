import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Your age: ");
        int number = Integer.parseInt(reader.nextLine()); // Reads a string variable from the keyboard and transfers it to an integer

        if (number >= 0 && number <= 120) {
            System.out.println("Ok");
        } else {
            System.out.println("Impossible!");
        }


    }
}
    