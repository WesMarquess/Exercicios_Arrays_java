import java.util.Scanner;

public class Arrays_Ex10 {
    public static void main(String[] args) {

        /*
        Dado um vetor de números reais e um número real, fazer um programa que multiplique os elementos de
        posição ímpar do vetor pelo número real dado e imprima o resultado.
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número real:");
        float n1 = input.nextFloat();

        float[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                float resultado = array[i] * n1;
                System.out.println("array[" + i + "] * " + n1 + " = " + resultado);
            }
        }
    }
}
