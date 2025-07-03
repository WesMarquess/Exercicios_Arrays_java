public class Arrays_Ex16 {
    public static void main(String[] args) {

        /*
        Fazer um programa que lê uma sequência de N números inteiros positivos e reordena os elementos da
        sequência de modo que todos os números pares venham primeiro e todos os ímpares em seguida. Por
        exemplo, para a sequência [3, 6, 7, 8, 1, 2, 5, 3, 9], a saída deverá ser: [6, 8, 2, 3, 7, 1, 5, 3, 9].
         */

        int[] array = {3, 6, 7, 8, 1, 2, 5, 3, 9};

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) { //verifica a posicao no array
                if (array[i] % 2 != 0 && array[j] % 2 == 0) {
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