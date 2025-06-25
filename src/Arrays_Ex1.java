import java.util.Scanner;

public class Arrays_Ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*1. Dado um vetor de números inteiros, fazer um programa que imprime todos os elementos do vetor.*/

        int[] array = {1, 2, 3, 4, 5};

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}