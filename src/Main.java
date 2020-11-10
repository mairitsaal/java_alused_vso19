import java.util.*;

    public class Main {
        public static void main(String[] args) {
            int tabeliSuurus = 10;
            int rida = 0;
            int veerg = 0;

            for (rida = 0; rida < tabeliSuurus; rida++) {

                for (veerg = 0; veerg < tabeliSuurus; veerg++) {

                    if (rida > veerg) {

                        System.out.print(tabeliSuurus - 1 - rida);
                    } else {

                        System.out.print(tabeliSuurus - 1 - veerg);
                    }
                }
                System.out.println();
            }
        }

    }

