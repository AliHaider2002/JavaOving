package Generell;

public class Oving {

    public static void printMyndig(int alder){

        if (alder > 18){
            System.out.println("Du er myndig og kan stemme!");
        }
        else {
            System.out.println("Du er ikke myndig og kan derfor ikke stemme!");
        }
    }


    public static void main(String[] args) {

       int alder = 20;
       printMyndig(alder);

    }
}
