import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Create a program that calculates the sum 1+2+3+…+n where n is a number entered by the user.
        Scanner reader = new Scanner(System.in);
        System.out.print("Your number: ");
        int number = Integer.parseInt(reader.nextLine());

       // String number = reader.nextLine(); // Reads a line of input from the user and assigns it
        //     to the variable called name
        int count = 0; //loen arve, alustan 0-st
        int sum = 0; //arvude summa

        while (count <= number) { //loenda kuni sisestatud numbrini
            sum += count; //summale lisad uue loendatud arvu juurde
            ++count; //suurendad ühe võrra
        }
        System.out.println(sum);
        }
}
