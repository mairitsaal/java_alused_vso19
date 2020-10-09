import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Call the number:  ");
        int upperNumber = Integer.parseInt(reader.nextLine());
        int currentNumber = 1;
        while (currentNumber <= upperNumber) {
            System.out.println(currentNumber);
            currentNumber++;
        }
    }
}
    