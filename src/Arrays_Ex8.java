import java.util.Scanner;

public class Arrays_Ex8 {
    public static void main(String[] args) {

        /*
        Dado um vetor de números inteiros e um número inteiro, fazer um programa que verifique se o número
        está presente no vetor.
         */

        Scanner input = new Scanner(System.in);

        int[] array = {7, 45, 12, 3, 6, 1, 5, 4};

        boolean encontrado = false;

        System.out.println("Digite um numero inteiro");
        int n1 = input.nextInt();


        for (int i = 0; i < array.length; i++) {
            if (array[i] == n1) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("O número " + n1 + " está presente no vetor ");
        } else {
            System.out.println("O número " + n1 + " NÃO está presente no vetor");
        }
    }
}