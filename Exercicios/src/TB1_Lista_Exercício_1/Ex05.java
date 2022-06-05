package TB1_Lista_Exercício_1;

/**
 * Faça um programa que calcula e mostra a área de um triângulo.
 * Sabe-se que Área = (base * altura) / 2.
 */

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o tamanho da base do triângulo: ");
        double base = scan.nextDouble();

        System.out.print("Informe o tamanho da altura do triângulo: ");
        double altura = scan.nextDouble();

        double area = (base * altura) / 2;
        System.out.print("A Área do triângulo é: " + area);
    }
}
