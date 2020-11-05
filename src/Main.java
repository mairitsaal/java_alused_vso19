import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int numberDrawn = drawNumber();

        int userNumber = 0;

        while (true) {
            System.out.print("Guess a number: ");
            userNumber = Integer.parseInt(reader.nextLine());
            if (userNumber == numberDrawn){
                System.out.println("Congratulations, your guess is correct!");
                break;
            } else if(userNumber < numberDrawn) {
                System.out.println("The number is greater, guesses made: " + userNumber);
            } else {
                System.out.println("The number is lesser, guesses made: " + userNumber);
            }
        }
        }

    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}


