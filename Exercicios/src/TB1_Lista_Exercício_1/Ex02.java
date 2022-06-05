package TB1_Lista_Exercício_1;

/**
 * Crie um programa que lê 2 notas de um aluno.
 * Cada nota terá um peso que também deverá ser lido.
 * O programa deverá fazeer a média ponderando as notas em relação aos pesos.
 */

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a nota de Matemática: ");
        double nota1 = scan.nextDouble();

        System.out.print("Informe o peso da disciplina Matemática: ");
        double peso1 = scan.nextDouble();

        double nota1xpeso1 = nota1 * peso1;

        System.out.print("A nota de matemática de acordo com seu peso é: " + nota1xpeso1);

        System.out.println();

        System.out.print("Informe a nota de Português: ");
        double nota2 = scan.nextDouble();

        System.out.print("Informe o peso da disciplina Português: ");
        double peso2 = scan.nextDouble();

        double nota2xpeso2 = nota2 * peso2;

        System.out.print("A nota de Português de acordo com seu peso é: " + nota2xpeso2);

        System.out.println();

        double media = (nota1xpeso1 + nota2xpeso2) / 2;
        System.out.print("A média das notas é: " + media);
    }
}
