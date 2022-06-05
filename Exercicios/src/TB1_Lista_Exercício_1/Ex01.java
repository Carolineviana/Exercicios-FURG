package TB1_Lista_Exercício_1;

/**
 * Crie um programa que lê 4 notas de um aluno, calcula e mostra a média das notas
 */

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a nota do 1º bimestre: ");
        double nota1 = scan.nextDouble();

        System.out.print("Informe a nota do 2º bimestre: ");
        double nota2 = scan.nextDouble();

        System.out.print("Informe a nota do 3º bimestre: ");
        double nota3 = scan.nextDouble();

        System.out.print("Informe a nota do 4º bimestre: ");
        double nota4 = scan.nextDouble();

        double média = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A média das 4 notas é: " + média);
    }
}
