package TB3_Lista_Exercício_3;

/**
 * Dado um número N, inteiro e positivo, obter a soma dos N primeiros ímpares.
 */

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        System.out.print("Informe 10 números inteiros e positivos: ");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = scan.nextInt();
        }
        int impar = 0;
        System.out.print("Os 10 números informados foram: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
            if (vetorA[i] % 2 != 0){
                impar = impar + vetorA[i];
            }
        }
        System.out.println();
        System.out.println("Total da soma dos ímpares: " + impar);
    }
}
