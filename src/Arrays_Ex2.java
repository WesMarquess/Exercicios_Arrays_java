public class Arrays_Ex2 {
    public static void main(String[] args) {

        /*2. Dado um vetor de números reais, fazer um programa que some
        todos os elementos do vetor e imprima o resultado.*/

        float soma = 0;

        float[] array = {100, 200, 300, 400, 500};

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            soma += array[i];
        }
        System.out.println("Valor final da soma = " + soma);
    }
}
