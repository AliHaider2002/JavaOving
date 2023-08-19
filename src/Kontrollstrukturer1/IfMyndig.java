package Kontrollstrukturer1;

import javax.swing.*;

public class IfMyndig {


    public static void main(String[] args) {

        int alder = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn alderen din"));

        if (alder >= 18 && alder <= 20){
            System.out.println("Du er myndig, men kan ikke kjøpe mer enn 22% på polet");
        }
        else{
            System.out.println("Du er enten umyndig eller så kan du kjøpe hva du vil på polet.");
        }

    }
}
