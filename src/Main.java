import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //Scanner reader = new Scanner(System.in);
        //userNumber = Integer.parseInt(reader.nextLine());
        int answer =  least(5, 2);
        System.out.println("Least: " + answer);

    }
    public static int least(int number1, int number2) {
        if(number1<number2){
            return number1;
        }else {
            return number2;
        }
        // do not print anything inside the method

        // method needs a return in the end
    }
}


