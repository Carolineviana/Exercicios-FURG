package TB3_Lista_Exercício_3;
/**
 * Some os números de 1 a 100 e imprima o valor
 */


public class Ex03 {
    public static void main(String[] args) {

        int soma = 0;
        for (int i = 0; i<=100; i++) {
            System.out.println(i);
            soma = soma + i;
        }
        System.out.println("A soma de todos os números entre 1 e 100 é: " + soma);
    }
}
