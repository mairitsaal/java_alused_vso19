import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Scanner reader = new Scanner(System.in);
        //System.out.print("How many: ");
        //int numbers = Integer.parseInt(reader.nextLine());
        //int i = 1;//it should be i = 1; and not i = 0;
        //while (i <= numbers) {
        //  i++;

        printStars(5);
        System.out.println();
        printStars(3);
        System.out.println();
        printSquare(2);

    }


    private static void printStars(int amount) {
        // you can print one star with the command
        for (int i = 0; i < amount; i++) {
            System.out.print("*");
        }
        System.out.println();
        // reavahetus

    }

    private static void printSquare(int sideSize) {
        // you can print one star with the command
        for (int i = 0; i < sideSize; i++) {
            printStars(sideSize);

        }
        // call this command amount times
    }
}


