package klasserogobjekter;

import javax.swing.*;

public class Boker {

    public String tittel;
    public int pris;
    public String forfatter;
    public String ISBN;

    public void skrivUt(){
        System.out.println("Tittelen er "+ tittel);
        System.out.println("Prisen er "+ pris);
        System.out.println("Forfatteren er "+ forfatter);
        System.out.println("ISBN er "+ ISBN);
    }

    public static void main(String[] args) {
        Boker nyBok = new Boker();
        nyBok.tittel = JOptionPane.showInputDialog("Skriv inn tittelen på boka");
        nyBok.pris = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn prisen på boka"));
        nyBok.forfatter = JOptionPane.showInputDialog("Skriv inn navnet på forfatteren av boka");
        nyBok.ISBN = JOptionPane.showInputDialog("Skriv inn ISBN på boka");
        nyBok.skrivUt();


    }
}

