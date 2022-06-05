package TB3_Lista_Exercício_3;

/**
 * Um determinado material radioativo perde metade de sua massa a cada 50 segundos.
 * Dada a massa inicial, em gramas, faça um programa que determine o tempo necessário
 * para que essa massa se torne menor que 0,05 gramas
 */
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe o tamanho do material em gramas: ");
        double pesoMaterial = scan.nextDouble();

        int segundos = 0;

        while (pesoMaterial >= 0.05){
            pesoMaterial /= 2;
            segundos += 50;
        }
        System.out.println("Foram necessários " + segundos + " segundos para que a massa do material seja menor que 0.05 gramas.");
    }
}
