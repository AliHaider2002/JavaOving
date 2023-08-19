package klasserogobjekter2;

import javax.swing.*;

public class BensinKjøp {

    private String bensinstasjon;
    private String bensintype;
    private double antallLiter;
    private double prisprliter;
    private String tidfylt;

    public BensinKjøp(String bensinstasjon, String bensintype, double antallLiter, double prisprliter, String tidfylt){
        this.bensinstasjon = bensinstasjon;
        this.bensintype = bensintype;
        this.antallLiter = antallLiter;
        this.prisprliter = prisprliter;
        this.tidfylt = tidfylt;
    }

    public String getBensinstasjon() {
        return bensinstasjon;
    }

    public void setBensinstasjon(String bensinstasjon) {
        this.bensinstasjon = bensinstasjon;
    }

    public String getBensintype() {
        return bensintype;
    }

    public void setBensintype(String bensintype) {
        this.bensintype = bensintype;
    }

    public double getAntallLiter() {
        return antallLiter;
    }

    public void setAntallLiter(double antallLiter) {
        this.antallLiter = antallLiter;
    }

    public double getPrisprliter() {
        return prisprliter;
    }

    public void setPrisprliter(double prisprliter) {
        this.prisprliter = prisprliter;
    }

    public String getTidfylt() {
        return tidfylt;
    }

    public void setTidfylt(String tidfylt) {
        this.tidfylt = tidfylt;
    }

    public double finnTotalPrisen(){

        double totalpris = antallLiter * prisprliter;
        return totalpris;
    }
    public void skrivUt(){

        String ut = "Bensinstasjon: "+ bensinstasjon + "\n" +
                "Bensintype: "+ bensintype + "\n" +
                "Antall liter fylt: "+ antallLiter + "\n" +
                "Prisen per liter: "+ prisprliter + "\n" +
                "Tidspunkt fylt: "+ tidfylt;
        JOptionPane.showMessageDialog(null, ut);

    }

    public static void main(String[] args) {

        String bensinstasjon = JOptionPane.showInputDialog("Skriv inn navnet på bensinstasjonen");
        String bensintype = JOptionPane.showInputDialog("Skriv inn navnet på bensintypen");
        double antallLiter = Double.parseDouble(JOptionPane.showInputDialog("Skriv inn antall liter fylt"));
        double prisperliter = Double.parseDouble(JOptionPane.showInputDialog("Skriv inn prisen per liter"));
        String tidspunktfylt = JOptionPane.showInputDialog("Skriv inn tidspunktet du fylte på");

        BensinKjøp nyBensinKjøp = new BensinKjøp(bensinstasjon, bensintype, antallLiter, prisperliter, tidspunktfylt);

        nyBensinKjøp.skrivUt();
    }
}
