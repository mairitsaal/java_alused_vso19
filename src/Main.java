import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Your number: ");
        int number = Integer.parseInt(reader.nextLine());

       // String number = reader.nextLine(); // Reads a line of input from the user and assigns it
        //     to the variable called name
        int count = 1;
        int sum = 1;

        while (count <= number) {
            sum *= count;
            ++count;
        }
        System.out.println(sum);
        }
}
