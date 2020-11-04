import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // The sum between two numbers
        Scanner reader = new Scanner(System.in);
        System.out.print("First number: ");
        int firstNumber = Integer.parseInt(reader.nextLine());
        System.out.print("Second number: ");
       // String number = reader.nextLine(); // Reads a line of input from the user and assigns it
        //     to the variable called name
        int secondNumber = Integer.parseInt(reader.nextLine());

        int sum = 0;

        while (firstNumber <=  secondNumber) {
            sum += firstNumber; // sum = sum + firstNumber
            firstNumber++;
        }
        System.out.println(sum);
        }
}
