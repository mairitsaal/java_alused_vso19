import java.util.*;

    public class Main {
        public static void main(String[] args) {
            Person pekka = new Person("Pekka", 15, 2, 1993);
            Person martin = new Person("Martin", 1, 3, 1955);

            System.out.println( martin.getName() + " is older than " +  pekka.getName() + ": "+ martin.olderThan(pekka) );
            System.out.println( pekka.getName() + " is older than " +  martin.getName() + ": "+ pekka.olderThan(martin) );
        }
        }
