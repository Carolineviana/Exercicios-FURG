package TB2_Lista_Exercício_2;

/**
 * Ler os valores de quatro notas escolares: N1, N2, N3 e N4. Calcular a média aritmética (variável MD1)
 * do aluno e apresentar a mensagem “Aprovado” se a média for maior ou igual a 7; caso contrário,
 * o programa deve solicitar uma quinta nota (nota do exame, variável NE) do aluno e calcular uma nova média aritmética
 * (variável MD2) entre a nota do exame e a primeira média aritmética. Se o valor da nova média maior ou igual a cinco,
 * apresentar a mensagem “Aprovado em exame”; caso contrário, apresentar a mensagem “Reprovado”.
 * Ao informar a situação final, também informar a média final.
 */

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a nota do 1º bimestre: ");
        double N1 = scan.nextDouble();

        System.out.print("Informe a nota do 2º bimestre: ");
        double N2 = scan.nextDouble();

        System.out.print("Informe a nota do 3º bimestre: ");
        double N3 = scan.nextDouble();

        System.out.print("Informe a nota do 4º bimestre: ");
        double N4 = scan.nextDouble();

        double media1 = (N1 + N2 + N3 + N4) / 4;
        System.out.println("A média das notas é: " + media1);

        if (media1 > 7){
            System.out.println("Sua média foi " + media1 + ". Você foi aprovado!! Parabéns!!");
        } else if (media1 < 7) {
            System.out.println("Sua média foi " + media1 + ". Você foi reprovado!! Precisa fazer exame final.");

            System.out.println("Nota mínima necessária para ser aprovado é 5.");

            System.out.print("Informe sua nota do exame: ");
            double exame = scan.nextDouble();

                if (exame >= 5) {
                    System.out.println("Parabéns, você foi aprovado!");
                } else {
                    System.out.println("Você foi reprovado!!");
                }

                double mediafinal = (N1 + N2 + N3 + N4 + exame) / 5;
                System.out.println("Sua média final é: " + mediafinal);
        }
    }
}
