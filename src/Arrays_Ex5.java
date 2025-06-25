public class Arrays_Ex5 {
    public static void main(String[] args) {

        /*5. Dado um vetor de números inteiros, fazer um programa que imprima a média dos elementos do vetor.*/

        int[] array = {10, 20, 30, 40, 50};

        int soma = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            soma += array[i];
        }
        int media = soma / array.length;
        System.out.println("Essa é a media dos valores somados: " + media);
    }
}
