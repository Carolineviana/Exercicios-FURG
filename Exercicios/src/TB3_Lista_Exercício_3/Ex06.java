package TB3_Lista_Exercício_3;

/**
 * Chico tem 1,50 metros e cresce 2 centímetros por ano, enquanto Zé tem 1,10 metros e cresce 3 centímetros por ano.
 * Construa um algoritmo que calcule e imprima quantos anos serão necessários para que Zé seja maior que Chico
 */
public class Ex06 {
    public static void main(String[] args) {
        double chico = 1.50;
        double ze = 1.10;
        int anos = 0;

        while (ze<=chico){
            ze = ze + 0.03;
            chico = chico + 0.02;
            anos++;
        }
        System.out.println("Para Zé ser maior que Chico levou " + anos + " anos.");

    }
}
