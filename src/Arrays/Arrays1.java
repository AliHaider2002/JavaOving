package Arrays;

public class Arrays1 {

    public static void main(String[] args) {
        int[] liste = {1,2,3,4,5,6,7,8,9};
        //System.out.println(liste[3]);
        //System.out.println(liste[6]);

        int gjennomsnitt = 0;
        int teller = 0;
        int sum = 0;
        for (int i = 0; i < liste.length; i++){
            teller++;
            sum += liste[i];
        }
        gjennomsnitt = sum / teller;
        System.out.println("Summen av alle tallene er "+ sum);
        System.out.println("Gjennomsnittet av tallene er "+ gjennomsnitt);



    }
}
