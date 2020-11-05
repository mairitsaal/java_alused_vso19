import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int numberDrawn = drawNumber();

        int count = 0;
        int userNumber = 0;

        while (true) {
            System.out.print("Guess a number: ");
            userNumber = Integer.parseInt(reader.nextLine());
            if (userNumber == numberDrawn){
                count++;
                System.out.println("Congratulations, your guess is correct!" + " Guesses made: "+ count);
                break;
            } else if(userNumber < numberDrawn) {
                count++;
                System.out.println("The number is greater " + userNumber + ", guesses made: "+ count);
            } else {
                count++;
                System.out.println("The number is lesser " + userNumber + ", guesses made: "+ count);
            }
        }
        }

    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}


