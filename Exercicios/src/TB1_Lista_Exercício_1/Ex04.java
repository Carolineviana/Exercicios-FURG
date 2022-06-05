package TB1_Lista_Exercício_1;

/**
 * Um dos sócios da empresa XYZ LTDA ficou sabendo que você desenvolveu um programa de
 * reajuste salarioal para a empresa ABC LTDA e pediu que você desenvolva um programa similar.
 * Na verdade ele está pedindo que você acrescente ao programa anterior a possibilidade
 * dele informar não somente o sálario atual do funcionário, mas também o valor percentual
 * que deve ser incrementado para aquele funcionário, pois ele irá aplicar
 * valores percentuais diferentes a cada funcionário.
 */

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe seu salário atual: ");
        double salarioAtual = scan.nextDouble();

        System.out.print("Informe a porcentagem de aumento de salário: ");
        double porc = scan.nextDouble();

        double novoSalario = (salarioAtual * (porc/100)) + salarioAtual;

        System.out.print("Seu novo salário é: " + novoSalario);
    }
}
