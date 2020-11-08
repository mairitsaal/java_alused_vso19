import java.util.*;

    public class Main {
        public static void main(String[] args) {

            Counter counter1 = new Counter(0, true);
            Counter counter2 = new Counter(80);
            Counter counter3 = new Counter(true);
            Counter counter4 = new Counter();

            counter1.increase();
            counter2.increase();
            counter3.increase();
            counter4.increase();

            counter1.decrease();
            counter2.decrease();
            counter3.decrease();
            counter4.decrease();

            counter1.decrease();
            counter2.decrease();
            counter3.decrease();
            counter4.decrease();

            counter1.increase(10);
            counter2.increase(20);
            counter3.increase(30);
            counter4.increase(40);

            counter1.decrease(20);
            counter2.decrease(2);
            counter3.decrease(3);
            counter4.decrease(-10);

            System.out.println(counter1);
            System.out.println(counter2);
            System.out.println(counter3);
            System.out.println(counter4);
        }
    }