import java.util.Scanner;

public class Main {
        private static void printStars(int amount) {
            // you can print one star with the command
            //System.out.print("*");
            int howManyTimes = 1;
            while (howManyTimes <= amount) {
                System.out.print("*");
                howManyTimes++;
            }
            System.out.println();
        }

        public static void main(String[] args) {
            printStars(5);
            printStars(3);
            printStars(9);
        }
}

