import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type numbers:  ");

        int sum = 0;
        int count = 0;
        double average = 0.0;
        int odd = 0;
        int notOdd = 0;

        while(true) {
            int numbers = Integer.parseInt(reader.nextLine());
            if (numbers == -1){
                break;
            }
            sum += numbers;
            count++;
            average = (double)sum / count;
            if(numbers % 2 == 0) {
             odd++;
            } else {
             notOdd++;
            }
        }
        System.out.println("Thank you and see you later! ");
        System.out.println("Sum is: " + sum);
        System.out.println("How many numbers entered: " + count);
        System.out.println("Numbers average: " + average);
        System.out.println("Odd numbers : " + odd);
        System.out.println("NotOdd numbers : " + notOdd);

    }
}


    