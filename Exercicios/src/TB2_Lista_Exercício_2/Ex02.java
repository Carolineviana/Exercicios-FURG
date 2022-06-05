package TB2_Lista_Exercício_2;

/**
 * Efetuar a leitura de um valor numérico inteiro positivo ou negativo representado pela variável N
 * e apresentar o valor lido como sendo positivo.
 * Dica: se o valor lido for menor que zero, ele deve ser multiplicado por -1.
 */

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe um valor inteiro positivo ou negativo: ");
        int N = scan.nextInt();

        if (N < 0){
            N = N * -1;
            System.out.println("O número informado foi negativo: " + N);
        } else {
            System.out.println("O número informado foi positivo: " + N);
        }

    }
}
