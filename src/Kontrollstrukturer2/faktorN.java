package Kontrollstrukturer2;

public class faktorN {

    public static int printN(int n){

        int faktor = 1;
        for (int i=n; i>=1; i--){
            faktor = faktor * i;
        }
        System.out.println(faktor);
        return faktor;
    }


    public static void main(String[] args) {


        printN(3);

    }
}
