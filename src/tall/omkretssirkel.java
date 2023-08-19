package tall;

import javax.swing.*;

public class omkretssirkel {
    public static void main(String[] args) {

        String innRadius = JOptionPane.showInputDialog("Skriv inn radiusen");
        double radius = Double.parseDouble(innRadius);

        double omkrets = 2 * 3.14 * radius;

        String omkretsMedtoDesimaler = String.format("%.2f", omkrets);

        String ut = "Omkretsen av en sirkel med "+ radius + " cm som radius blir "+ omkretsMedtoDesimaler + " cm ";

        System.out.println(ut);
    }
}
