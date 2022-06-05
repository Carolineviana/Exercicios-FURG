package TB2_Lista_Exercício_2;

/**
 * Ler três valores inteiros, em qualquer ordem, representados pelas variáveis A, B e C.
 * Apresentar os valores lidos em ordem decrescente.
 * Dica: você precisará fazer trocas de posição dos elementos.
 */

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o valor de A: ");
        int A = scan.nextInt();

        System.out.print("Informe o valor de B: ");
        int B = scan.nextInt();

        System.out.print("Informe o valor de C: ");
        int C = scan.nextInt();

        if (A>B && A>C && B>C){
            System.out.print("A ordem foi ABC: " + A + ", " + B + ", " + C + ".");
        } else if (A>B && A>C && C>B){
            System.out.println("A ordem foi ACB: " + A + ", " + C + ", " + B + ".");
        }else if (B>A && B>C && A>C){
            System.out.println("A ordem foi BAC: " + B + ", " + A + ", " + C + ".");
        }else if (B>A && B>C && C>A){
            System.out.println("A ordem foi BCA: " + B + ", " + C + ", " + A + ".");
        }else if (C>A && C>B && A>B){
            System.out.println("A ordem foi CAB: " + C + ", " + A + ", " + B + ".");
        }else {
            System.out.println("A ordem foi CBA: " + C + ", " + B + ", " + A + ".");
        }
    }
}