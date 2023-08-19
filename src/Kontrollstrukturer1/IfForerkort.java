package Kontrollstrukturer1;

import javax.swing.*;

public class IfForerkort {

    public static void main(String[] args) {

        int alder = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn alderen din"));

        if (alder >= 18){
            JOptionPane.showMessageDialog(null,
                    "Du kan ta førerkortet for bil da du er gammel nok!");
        }
        /*if (alder < 18){
            JOptionPane.showMessageDialog(null,
                    "Du er for ung til å ta førerkort for bil!");
        } */

        else{
            JOptionPane.showMessageDialog(null,
                    "Du kan ikke ta førerkortet for bil. Du er ikke gammel nok!");
        }
    }
}
