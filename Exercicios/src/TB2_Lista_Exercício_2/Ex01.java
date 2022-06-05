package TB2_Lista_Exercício_2;

/**
 * Efetuar a leitura de dois valores numéricos inteiros representados pelas variáveis A e B e
 * apresentar o resultado da diferença do maior valor pelo menor valor.
 */

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe um valor inteiro para A: ");
        int A = scan.nextInt();

        System.out.print("Informe um valor interiro para B: ");
        int B = scan.nextInt();

        int diferenca;
        if (A > B){
            diferenca = A - B;
            System.out.println("A diferença do maior valor pelo menor é: " + diferenca);
        } else {
            diferenca = B - A;
            System.out.println("A diferença do maior valor pelo menor é: " + diferenca);
        }

    }
}
