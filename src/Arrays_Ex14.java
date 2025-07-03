public class Arrays_Ex14 {
    public static void main(String[] args) {

        /*
        Dados dois vetores A e B de mesma dimensão, fazer um programa que monte o vetor C, o qual deve ser
        composto, alternadamente, por um elemento do vetor A e outro do vetor B. Imprimir o vetor C.
         */

        int[] arrayA = {1, 3, 5, 7, 9};
        int[] arrayB = {2, 4, 6, 8, 10};
        int[] arrayC = new int[10];

        int x = 0;
        for (int i = 0; i < arrayA.length; i++) {
            arrayC[x++] = arrayA[i];
            arrayC[x++] = arrayB[i];
        }

        for (int i = 0; i < arrayC.length; i++) {
            System.out.println("Array C de posicao [" + i + "]: " + arrayC[i]);
        }
    }
}

