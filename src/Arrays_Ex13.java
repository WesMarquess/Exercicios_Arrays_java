public class Arrays_Ex13 {
    public static void main(String[] args) {

        /*
        Dados dois vetores A e B de mesma dimensão, fazer um programa que monte o vetor C, o qual deve ser
        composto pelos elementos do vetor A e depois pelos elementos do vetor B. Imprimir o vetor C
         */

        int[] vetorA = {1, 2, 3, 4, 5};
        int[] vetorB = {6, 7, 8, 9, 10};
        int[] vetorC = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            vetorC[i] = vetorA[i];
        }

        for (int i = 0; i < vetorB.length; i++) {
            vetorC[i + vetorA.length] = vetorB[i];
        }

        System.out.println("Vetor C:");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.println(vetorC[i]);
        }
    }
}

