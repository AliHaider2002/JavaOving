package tall;

import javax.swing.*;

public class førerkort {

    public static void main(String[] args) {

        String innAlder = JOptionPane.showInputDialog("Skriv inn alderen din");
        int alder = Integer.parseInt(innAlder);

        if(alder >= 18){
            JOptionPane.showMessageDialog(null, "Du er gammel nok til å kunne ta forerkort");
        }
        else{
            JOptionPane.showMessageDialog(null, "Du er IKKE gammel nok til å ta førerkort");
        }
    }


}
