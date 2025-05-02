package org.example;

public class Main {

    // creiamo il metodo per controllare gli "1"
    // creando un for loop dentro al nuovo metodo
    public static void sostituisciDuplicati (int[] array){
        for (int i = 0; i < array.length; i++){
            for (int j = i + 1; j < array.length; j++){
                if (array[i] == array[j] && array[i] != -1){
                    array[j] = -1;
                }
            }
        }
    }
    public static void stampaArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]);
            if (i < array.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int numeri[] = {1, 3, 5, 3, 7, 8, 5, 8, 2, 10};
        System.out.print("Array originale: ");
        stampaArray(numeri);

        sostituisciDuplicati(numeri);

        System.out.print("Array dopo la sostituzione: ");
        stampaArray(numeri);
    }

}