package TB3_Lista_Exercício_3;

/**
 * Faça um programa que mostre as tabuadas dos números de 1 a 10 (Utilizar Repetição Aninhada)
 */

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe qual tabuada você deseja: ");
        int tabuada = scan.nextInt();

        for (int i = 0; i<=10 ; i++) {
            System.out.println(tabuada + " x " + i + " = " + (tabuada*i));
        }
    }
}
