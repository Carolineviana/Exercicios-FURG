package TB3_Lista_Exercício_3;

/**
 * Faça um algoritmo que imprima os múltiplos positivos de 7, inferiores a 1000
 */

public class Ex05 {
    public static void main(String[] args) {
        for (int i=0; i<1000; i++){
            if (i % 7 == 0){
                System.out.println(i);
            }
        }
    }
}
