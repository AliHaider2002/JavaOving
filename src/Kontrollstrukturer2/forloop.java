package Kontrollstrukturer2;

public class forloop {

    public static void main(String[] args) {

      /* for (int i=0; i < 10; i++){
            System.out.println(i);
        } */

       int sum=0;
       for (int i = 0; i < 10; i++){
           sum += i;
       }
        System.out.println("Summen av alle tallene fra 0 til 9 er "+ sum);
    }
}
