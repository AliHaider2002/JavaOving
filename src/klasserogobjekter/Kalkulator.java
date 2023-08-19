package klasserogobjekter;

import javax.swing.*;

public class Kalkulator {


    public static double addere(double tall1, double tall2){
        double resultat1 = tall1 + tall2;
        return resultat1;

    }
    public static double subtrahere(double tall1, double tall2){
        double resultat2 = tall1 - tall2;
        return resultat2;
    }
    public static double multiplisere(double tall1, double tall2){
        double resultat3 = tall1 * tall2;
        return resultat3;
    }
    public static double dividere(double tall1, double tall2){
        double resultat4 = tall1 / tall2;
        return resultat4;
    }

    public static void main(String[] args) {

        double tall1 = Double.parseDouble(JOptionPane.showInputDialog("Skriv inn det første tallet"));
        double tall2 = Double.parseDouble(JOptionPane.showInputDialog("Skriv inn det andre tallet"));
        System.out.println(tall1 + " + "+ tall2 + " blir "+ addere(tall1,tall2));
        System.out.println(tall1 + " - "+ tall2 + " blir "+ subtrahere(tall1,tall2));
        System.out.println(tall1 + " * "+ tall2 + " blir "+ multiplisere(tall1,tall2));
        System.out.println(tall1 + " / "+ tall2 + " blir "+ dividere(tall1,tall2));


    }

}
