import java.util.Scanner;

public class Arrays_Ex7 {
    public static void main(String[] args) {

        /*
         Dado um vetor de números inteiros e um número inteiro, fazer um programa
         que multiplique todos os elementos do vetor pelo número  dado
         e imprima o resultado.
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero inteiro");
        int n1 = input.nextInt();
        int mult;

        int[] array = {1, 2, 3, 4, 5};

        for (int i = 0; i < array.length; i++) {
            mult = array[i] * n1;
            System.out.println("A multiplicacao desse indice é: " + mult);
        }
    }
}
