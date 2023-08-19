package Kontrollstrukturer1;

import javax.swing.*;

public class Månedårstid {

    public static void main(String[] args) {

        String måned = JOptionPane.showInputDialog("Skriv inn en måned");

        if (måned.equals("Juni") || måned.equals("Juli") || måned.equals("August")){
            JOptionPane.showMessageDialog(null, "Det er sommer!");
        }
        else if (måned.equals("September") || måned.equals("Oktober") || måned.equals("November")){
            JOptionPane.showMessageDialog(null, "Det er høst!");
        }
        else if (måned.equals("Desember") || måned.equals("Januar") || måned.equals("Februar")){
            JOptionPane.showMessageDialog(null, "Det er vinter!");
        }
        else if (måned.equals("Mars") || måned.equals("April") || måned.equals("Mai")){
            JOptionPane.showMessageDialog(null,"Det er vår!");
        }
        else {
            JOptionPane.showMessageDialog(null,
                    "Du må oppgi noe eller skrive riktig måned!");
        }

    }
}
