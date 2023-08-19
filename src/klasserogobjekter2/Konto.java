package klasserogobjekter2;

import javax.swing.*;

public class Konto {

    private String navn;
    private String kontonummer;
    private double saldo;

    public Konto(String navn, String kontonummer, double saldo){
        this.navn = navn;
        this.kontonummer = kontonummer;
        this.saldo = saldo;
    }
    public String getNavn() {
        return navn;
    }
    public void setNavn(String navn) {
        this.navn = navn;
    }
    public String getKontonummer() {
        return kontonummer;
    }
    public void setKontonummer(String kontonummer) {
        this.kontonummer = kontonummer;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void skrivUt(){
        String ut = "Navn: "+ navn + "\n" +
                    "Kontonummer: "+ kontonummer + "\n" +
                    "Saldo: "+ saldo;
        JOptionPane.showMessageDialog(null, ut);
    }
    public String settInn(double beløp){

        saldo += beløp;
        String ut = "Den nye saldoen er nå "+ String.format("%.2f", saldo);
        return ut;
    }
    public String taUt(double beløp){

        if (beløp <= saldo){
            saldo = saldo - beløp;
            return "Den nye saldoen etter uttak er "+ saldo;
        }
        else {
            return "Det er ikke nok dekning på kontoen til å ta ut penger";
        }
    }
}
