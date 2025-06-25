public class Arrays_Ex3 {
    public static void main(String[] args) {

        /*3. Dado um vetor de números inteiros, fazer um programa que imprima o maior elemento do vetor.*/

        int[] array = {10, 20, 30, 40, 50};

        int maior = array[0];

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            if (array[i] > maior) {
                maior = array[i];
            }
        }
        System.out.println("Esse é o maior numero: " + maior);
    }
}