import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("How many: ");
        int numbers = Integer.parseInt(reader.nextLine());
        int i = 1;//it should be i = 1; and not i = 0;
        while (i <= numbers) {
            i++;
            printText();
        }
    }

    public static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }
        }


