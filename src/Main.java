import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the points [0-60]: ");
        int number = Integer.parseInt(reader.nextLine());

        if ( number >= 20 && number <= 29) {
            System.out.println("Failed");
        } else if (number >= 30 && number <= 34) {
            System.out.println("Grade 1");
        } else if (number >= 35 && number <= 39) {
            System.out.println("Grade 2");
        } else if (number >= 40 && number <= 44) {
            System.out.println("Grade 3");
        } else if (number >= 45 && number <= 49) {
            System.out.println("Grade 4");
        } else if (number >= 50 && number <= 60) {
            System.out.println("Grade 5");
        }

    }
}
    