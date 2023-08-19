package klasserogobjekter2;

import javax.swing.*;

public class Person {

    private String fornavn;
    private String etternavn;
    private String adresse;
    private String telefonnr;

    public Person(String fornavn, String etternavn, String adresse, String telefonnr){
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.adresse = adresse;
        this.telefonnr = telefonnr;
    }
    public void setFornavn(String fornavn){
        this.fornavn = fornavn;
    }

    public String getFornavn() {
        return fornavn;
    }
    public void setEtternavn(String etternavn){
        this.etternavn = etternavn;
    }

    public String getEtternavn() {
        return etternavn;
    }
    public void setAdresse(String adresse){
        this.adresse = adresse;
    }

    public String getAdresse() {
        return adresse;
    }
    public void setTelefonnr(String telefonnr){
        this.telefonnr = telefonnr;
    }

    public String getTelefonnr() {
        return telefonnr;
    }

    public void skrivUt(){
        String ut = "Fornavn: "+ fornavn + "\n" +
                    "Etternavn: "+ etternavn + "\n" +
                    "Adresse: "+ adresse + "\n" +
                    "Telefonnr "+ telefonnr + "\n";
        JOptionPane.showMessageDialog(null, ut);
    }

    public static void main(String[] args) {

        String fornavn = JOptionPane.showInputDialog("Skriv inn navnet ditt");
        String etternavn = JOptionPane.showInputDialog("Skriv inn etternavnet ditt");
        String adresse = JOptionPane.showInputDialog("Skriv inn adressen din");
        String telefonnr = JOptionPane.showInputDialog("Skriv inn telefonnummeret ditt");

        Person enPerson = new Person(fornavn, etternavn, adresse, telefonnr);

        enPerson.skrivUt();

    }
}
