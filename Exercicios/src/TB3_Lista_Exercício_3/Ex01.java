package TB3_Lista_Exercício_3;

/**
 * Faça um algoritmo que leia dois números inteiros positivos (Num1 e Num2)
 * e imprima o quociente (Quoc) e o resto (Resto) da divisão de Num1 por Num2,
 * utilizando apenas as operações de adição e subtração. Ex.: N1=10; N2=2 => Q=5 R=0
 */

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe um número inteiro: ");
        int num1 = scan.nextInt();

        System.out.print("Informe outro número inteiro: ");
        int num2 = scan.nextInt();

        int quoc = num1 / num2;
        int resto = num1 % num2;
        System.out.println("O quociente da divisão é " + quoc + " e o resto é " + resto + ".");
    }
}
