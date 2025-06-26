public class Arrays_Ex6 {
    public static void main(String[] args) {

        /*
        Dado um vetor de números inteiros, fazer um programa que imprima
        o produto dos elementos do vetor.
         */

        int[] array = {1, 2, 3, 4, 5};

        int produto;

        for (int i = 0; i < array.length; i++) {
            produto = array[i] * array[i];
            System.out.println(produto);
        }
    }
}
