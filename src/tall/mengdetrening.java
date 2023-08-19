package tall;

import javax.swing.*;

public class mengdetrening {

    public static void main(String[] args) {

        String inntall1 = JOptionPane.showInputDialog("Skriv inn det første desimaltallet");
        String inntall2 = JOptionPane.showInputDialog("Skriv inn det første desimaltallet");
        String inntall3 = JOptionPane.showInputDialog("Skriv inn det første desimaltallet");

        double tall1;
        double tall2;
        double tall3;
        try {
            tall1 = Double.parseDouble(inntall1);
            tall2 = Double.parseDouble(inntall1);
            tall3 = Double.parseDouble(inntall1);
        }
        catch (Exception e){
            tall1 = 0;
            tall2 = 0;
            tall3 = 0;
        }
        double sum = tall1 + tall2 + tall3;

        double gjennomsnitt = sum / 3;

        System.out.println("Gjennomsnittet av tallene er " + gjennomsnitt);
        JOptionPane.showMessageDialog(null, gjennomsnitt);

    }
}
