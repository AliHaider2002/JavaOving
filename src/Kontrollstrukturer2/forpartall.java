package Kontrollstrukturer2;

public class forpartall {

    public static void main(String[] args) {

        int sum = 0;
        int teller = 0;
        for (int i = 0; i < 100; i+=2){
          sum += i;
          teller++;

      }
        double gjennomsnitt = sum / teller;
        System.out.println("Summen av partallene er "+ sum);
        System.out.println("Gjennomsnittet av partallene er "+ gjennomsnitt);

    }
}
