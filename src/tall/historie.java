package tall;

import javax.swing.*;

public class historie {

    public static void main(String[] args) {

        String navn = JOptionPane.showInputDialog("Skriv inn navnet ditt");
        String innalder = JOptionPane.showInputDialog("Skriv inn alderen din");
        int alder = Integer.parseInt(innalder);
        int fødselsår = 2023-alder;
        int pensjonist = fødselsår+67;


        String ut = navn + " er idag "+ alder + " aar. Han er fodt i "+ fødselsår + ". I 2053 er han "+ pensjonist +
                "år og da vil han være pensjonist";

        System.out.println(ut);
    }
}
