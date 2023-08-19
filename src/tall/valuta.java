package tall;

import javax.swing.*;

public class valuta {
    public static void main(String[] args) {

        String innDollar = JOptionPane.showInputDialog("Skriv inn et beløp i amerikanske dollar");
        double dollar = Double.parseDouble(innDollar);

        double kroner = dollar * 10.27;

        String kronerMedToDesimaler = String.format("%.2f", kroner);

        String ut = dollar + " blir "+ kronerMedToDesimaler + " i norske kroner";

        JOptionPane.showMessageDialog(null, ut);

    }
}
