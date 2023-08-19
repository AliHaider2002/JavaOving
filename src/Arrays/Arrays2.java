package Arrays;

public class Arrays2 {


    public static void main(String[] args) {


        String[] navn = {"Per", "Hansen", "Line", "Olsen", "Ola", "Pedersen", "Kari", "Finnsen"};

        for (int i = 0; i < navn.length; i++){
            System.out.println(navn[i] + " "+ navn[i+1]);
        }
    }
}
