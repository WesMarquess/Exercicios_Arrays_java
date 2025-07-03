public class Arrays_Ex12 {
    public static void main(String[] args) {

        /*
        Dados dois vetores A e B de mesma dimensão, fazer um programa que verifica a soma e a média de cada
        vetor, e imprime a maior soma e a menor média.
         */

        int[] vetorA = {10, 20, 30, 40, 50};
        int[] vetorB = {1, 2, 3, 4, 5};

        int somaVetorA = 0;
        int somaVetorB = 0;

        //soma vetor A
        for (int i = 0; i < vetorA.length; i++) {
            somaVetorA += vetorA[i];
        }

        //soma vetor B
        for (int i = 0; i < vetorB.length; i++) {
            somaVetorB += vetorB[i];
        }

        // calculo da media
        int mediaVetorA = somaVetorA / vetorA.length;
        int mediaVetorB = somaVetorB / vetorB.length;

        //impressao da soma e da media

        if (somaVetorA > somaVetorB) {
            System.out.println("Soma do vetor A é a maior: " + somaVetorA);
        } else {
            System.out.println("Soma do vetor B é a maior: " + somaVetorB);
        }

        if (mediaVetorA < mediaVetorB) {
            System.out.println("Media do vetor A é a menor : " + mediaVetorA);
        } else {
            System.out.println("Media do vetor B é a menor : " + mediaVetorB);
        }


    }
}
