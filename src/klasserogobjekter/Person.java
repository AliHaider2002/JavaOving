package klasserogobjekter;

import javax.swing.*;
import java.time.LocalDate;

public class Person {

    public String navn;
    public String adresse;
    public String telefonnr;
    public int fødselsår;

    public int beregnAlder(){
        int alder = 2023 - fødselsår;
        return alder;
    }
    public void skrivUt(int alder){
        String ut = "Navn: "+ navn + "\n" +
                    "Adresse: "+ adresse + "\n" +
                     "Telefonnummer: "+ telefonnr + "\n" +
                      "Alder: "+ alder + "\n";
        JOptionPane.showMessageDialog(null, ut);
    }

    public static void main(String[] args) {
        Person nyPerson = new Person();
        String navn = JOptionPane.showInputDialog("Skriv inn navnet ditt");
        String adresse = JOptionPane.showInputDialog("Skriv inn adressen din");
        String telefonnummer = JOptionPane.showInputDialog("Skriv inn telefonnummeret ditt");
        String Innfødselsår = JOptionPane.showInputDialog("Skriv inn fødselsåret ditt");
        int fødselsår = Integer.parseInt(Innfødselsår);
        nyPerson.navn = navn;
        nyPerson.adresse = adresse;
        nyPerson.telefonnr = telefonnummer;
        nyPerson.fødselsår = fødselsår;
        int alder = nyPerson.beregnAlder();
        nyPerson.skrivUt(alder);

    }
}

