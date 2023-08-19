package Arrays;

public class StørstMinst {

    public static int størsteTall(int[] liste){
        int størstetall = liste[0];
        for (int i = 1; i < liste.length; i++){
            if (liste[i] > størstetall){
                størstetall = liste[i];
            }
        }
        return størstetall;
    }
    public static int minsteTall(int[] liste){
        int minstetall = liste[0];
        for (int i = 1; i < liste.length; i++){
            if (liste[i] < minstetall){
                minstetall = liste[i];
            }
        }
        return minstetall;
    }


    public static void main(String[] args) {

        int[] liste = {1,2,3,4,5,6,7,8,9};
        System.out.println("Største tallet i listen er "+ StørstMinst.størsteTall(liste));
        System.out.println("Minste tallet i listen er "+ StørstMinst.minsteTall(liste));
    }
}
