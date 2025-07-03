import java.util.Scanner;

public class Arrays_Ex15 {
    public static void main(String[] args) {

        /*
        Dado um vetor de números inteiros, fazer um programa que imprima o vetor em ordem crescente.
         */

        int[] array = {12, 63, 52, 41, 31};

        //ordenando o array sem bubble sort, de forma manual
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) { //verifica a posicao no array
                if (array[i] > array[j]) {
                    int ordenar = array[i];
                    array[i] = array[j];
                    array[j] = ordenar;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}