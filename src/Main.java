import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("First: ");
        int firstNumber = Integer.parseInt(reader.nextLine());
        System.out.print("Second: ");
       // String number = reader.nextLine(); // Reads a line of input from the user and assigns it
        //     to the variable called name

        int secondNumber = Integer.parseInt(reader.nextLine());

        if (firstNumber <= secondNumber){
            System.out.println(firstNumber);
            firstNumber++;
        }else {
                System.out.println("First: " + firstNumber + "Second: " + secondNumber);
            }
        }
}