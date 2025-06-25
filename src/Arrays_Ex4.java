public class Arrays_Ex4 {
    public static void main(String[] args) {

        /*4. Dado um vetor de números reais, fazer um programa que imprima o menor elemento do vetor.*/
        double[] array = {100.0, 80.5, -660.2, 40.4, 20.1, -50.0};
        double menor = array[0];

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            if (array[i] < menor) {
                menor = array[i];
            }
        }
        System.out.println("Esse é o menor numero: " + menor);
    }
}