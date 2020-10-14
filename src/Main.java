import java.util.Scanner;

public class Main {
    public static void printRectangle(int width, int height) {
        // 39.3
        int count = 0;
        while (count < width && count < height) {

            printStars(width);
            System.out.print("*");
            count++;

        }

    }
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
            printRectangle(17, 3);
        }


}

