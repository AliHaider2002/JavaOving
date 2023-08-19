package Kontrollstrukturer1;

import javax.swing.*;

public class IfForerkort2 {

    public static void main(String[] args) {

        int alder = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn alderen din"));
        int hoyesteAlder = 70;

        if (alder >= 18 && alder < hoyesteAlder){
            System.out.println("Du kan ta førerkortet for bil og trenger ikke årlige legesjekker.");
        }
        else if (alder >= 18 && alder > hoyesteAlder){
            System.out.println("Du er absolutt gammel nok til å kjøre bil, men må ha årlige legesjekker!");
        }
        else{
            System.out.println("Du er for ung til å ta førerkort for bil!");
        }
    }
}
