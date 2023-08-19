//mangler oppgave 11,7 og 5.

package tall;


import javax.swing.*;

public class arealrektangel {

    public static void main(String[] args) {

        String innstreng1 = JOptionPane.showInputDialog("Skriv inn lengden på rektangelet");
        String innstreng2 = JOptionPane.showInputDialog("Skriv inn bredden på rektangelet");
        double lengde = Double.parseDouble(innstreng1);
        double bredde = Double.parseDouble(innstreng2);

        double areal = lengde * bredde;

        String ut = "Et rektangel med bredde "+ bredde + " cm og lengde "+ lengde + " cm har et areal på "+ areal
                + " cm^2 ";

        System.out.println(ut);
    }
}
