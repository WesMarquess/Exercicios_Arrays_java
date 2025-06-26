public class Arrays_Ex9 {
    public static void main(String[] args) {

        /*Dados dois vetores A e B de mesma dimensão, fazer um programa que calcule e imprima o produto de
        cada elemento de A pelo correspondente elemento de B. O resultado deve ser armazenado em um vetor
        C.
        */

        int[] arrayA = {10, 20, 30, 40, 50};
        int[] arrayB = {1, 2, 3, 4, 5};
        int[] arrayC = new int[5];

        for (int i = 0; i < arrayA.length; i++) {
            arrayC[i] = arrayA[i] * arrayB[i];
            System.out.println("Produto[" + i + "] = " + arrayC[i]);
        }
    }
}
