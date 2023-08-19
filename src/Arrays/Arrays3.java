package Arrays;

public class Arrays3 {

    public static int min(int[] innListe) {
        int minstetall = innListe[0];
        for (int i : innListe) {
            if (i < minstetall) {
                minstetall = i;
            }
        }
        return minstetall;
    }

    public static int maks(int[] innListe) {
        int størstetall = innListe[0];
        for (int i : innListe) {
            if (i > størstetall) {
                i = størstetall;
            }
        }
        return størstetall;
    }


    public static void main(String[] args) {

        int[] liste = {45, 34, 5, 8, 10, 2, 13, 25};
        System.out.println(min(liste));
        System.out.println(maks(liste));

        //skriv ut tallene baklengs
        /*for(int i = liste.length - 1; i >= 0; i--){
            System.out.print(liste[i] + " ");
        }*/
    }
}


