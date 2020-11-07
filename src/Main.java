import java.util.*;

    public class Main {
        public static void main(String[] args) throws Exception {
            NumberStatistics stats = new NumberStatistics();

            NumberStatistics allNumbers = new NumberStatistics();
            NumberStatistics evenNumbers = new NumberStatistics();
            NumberStatistics oddNumbers = new NumberStatistics();

            stats.addNumber(3);
            stats.addNumber(5);
            stats.addNumber(1);
            stats.addNumber(2);
            System.out.println("Amount: " + stats.amountOfNumbers());
            System.out.println("sum: " + stats.sum());
            System.out.println("average: " + stats.average());

            Scanner reader = new Scanner(System.in);
            System.out.println("Type numbers:");
            int number = Integer.parseInt(reader.nextLine());
            while(number != -1){
                allNumbers.addNumber(number);
                if(number % 2 == 0){
                    evenNumbers.addNumber(number);
                } else {
                    oddNumbers.addNumber(number);
                }

                number = Integer.parseInt(reader.nextLine());
            }
            System.out.println("sum: " + allNumbers.sum());
            System.out.println("sum of even: " + evenNumbers.sum());
            System.out.println("sum of odd: " + oddNumbers.sum());
        }
    }