import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the number:  ");
        int number = Integer.parseInt(reader.nextLine());
        int checkNumber = 1;
        int sum = 0;
        while ( checkNumber <= number){
            System.out.println(checkNumber);
            sum+= checkNumber;
            checkNumber++;
        }
        System.out.println("Sum is " + sum);
    }
}


    