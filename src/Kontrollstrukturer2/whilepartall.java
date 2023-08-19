package Kontrollstrukturer2;

public class whilepartall {
    public static void main(String[] args) {

        /*int i = 0;
        while (i < 20){
            System.out.println(i + " ");
            i += 2; */

        int i = 0;
        int sum = 0;
        int teller = 0;
        while (i < 100){
            sum += i;
            i += 2;
            teller++;
        }
        double gjennomsnitt = sum / teller;
        System.out.println("Summen av partallene er "+ sum);
        System.out.println("Gjennomsnittet er "+ gjennomsnitt);

    }
}
