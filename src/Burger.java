import java.util.ArrayList;
import java.util.Scanner;

public class Burger {
    private String nimi;
    private String liha;
    private String sai;
    private double hind;
    ArrayList<String> lisandid = new ArrayList<String>();
    private double koigiLisanditeHind = 1.00;
    int lisanditeArv = 0;

    public Burger(String nimi, String liha, String sai, double hind){
        this.nimi = nimi;
        this.liha = liha;
        this.sai = sai;
        this.hind = hind;
    }

    public Burger(String nimi, String liha, double hind){
        this.nimi = nimi;
        this.liha = liha;
        this.hind = hind;
        this.sai = "teraleib";
    }
    public void lisaLisandid(){
        Scanner scanner = new Scanner(System.in);

        while(lisanditeArv < 4) {
            System.out.println("Sisesta lisandid: ");
            String lisand = scanner.nextLine();
            if(lisand.equals("")) {
                break;
            }
            else this.lisandid.add(lisand);
            lisanditeArv++;
        }
        System.out.println("Sa lisasid juurde: ");
        for(String lisa : this.lisandid) {
            System.out.print(lisa + " ");
        }
        System.out.println();
        System.out.println("Kokku on lisandeid " + lisanditeArv + ".");
    }

    public double koostaBurger(){
        return this.hind + (lisanditeArv * koigiLisanditeHind);
    }

    public String toString() {
        return this.nimi + " - " + this.liha + ", " + this.sai + ". Hind: " + this.hind;
    }
}
