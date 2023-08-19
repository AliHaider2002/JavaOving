package klasserogobjekter2;

import javax.swing.JOptionPane;
import java.util.jar.JarEntry;

public class Bank {

    public static void main(String[] args) {

        String navn = JOptionPane.showInputDialog("Skriv inn navnet ditt!");
        String kontonummer = JOptionPane.showInputDialog("Skriv inn kontonummeret!");
        double saldo = Double.parseDouble(JOptionPane.showInputDialog("Skriv inn saldoen på kontoen"));

        Konto enKonto = new Konto(navn, kontonummer, saldo);

        System.out.println(enKonto.settInn(2000));
        System.out.println(enKonto.taUt(200));
        enKonto.skrivUt();


    }
}
