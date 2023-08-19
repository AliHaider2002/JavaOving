package Arrays;

public class Arrays4 {


    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};

// Sjekk om arrayene er like
        if (array1.length != array2.length) {
            System.out.println("Arrayene er ikke like");
        } else {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i]) {
                    System.out.println("Arrayene er ikke like");
                    break;
                }
                if (i == array1.length - 1) {
                    System.out.println("Arrayene er like");
                }
            }
        }

    }
}