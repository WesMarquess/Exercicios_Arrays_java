import java.util.Scanner;

public class Arrays_Ex11 {
    public static void main(String[] args) {

        /*
        Dado um vetor de números reais, fazer um programa que imprima os números maiores do que a média
        dos elementos que estão nas posições pares do vetor.
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o tamanho do array: ");
        int tamanho = input.nextInt();

        float[] array = new float[tamanho];
        float soma = 0;
        int contador = 0;

        for (int i = 0; i < tamanho; i++) {         //populando o array
            System.out.print("Digite um número real para a posição [" + i + "]: ");
            array[i] = input.nextFloat();

            if (i % 2 == 0) {
                soma += array[i];
                contador++;
            }
        }

        float media = soma / contador;

        System.out.printf("\nMédia dos elementos nas posições pares: %.2f\n", media);
        System.out.println("Números maiores do que essa média:");

        for (int i = 0; i < tamanho; i++) {         //imprime maior que a media
            if (array[i] > media) {
                System.out.println("array[" + i + "] = " + array[i]);
            }
        }
    }
}
