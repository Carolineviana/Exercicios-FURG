package TB1_Lista_Exercício_1;

/**
 * O proprietário da empresa ABC LTDA precisa de um programa de computador para
 * calcular o novo salário que seus funcionários irão receber a partir do mês que vem.
 * Sabendo que o aumento de salário para todos os funcionários será de 25%
 * faça um programa que lê o valor do salário atual do funcionário
 * e informa o seu novo salário acrescido de 25%.
 */

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe seu salário atual: ");
        double salarioAtual = scan.nextDouble();

        double novoSalario = salarioAtual * 1.25;

        System.out.print("Seu novo salário é: " + novoSalario);

    }
}
