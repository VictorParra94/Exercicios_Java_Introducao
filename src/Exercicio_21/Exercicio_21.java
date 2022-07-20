package Exercicio_21;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_21 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de divisões");
        double n = sc.nextDouble();

        for (int i = 0; i < n; i++){
            double x = sc.nextInt();  double y = sc.nextInt();

            if (y != 0) {
                double divisao = x / y;
                System.out.printf("Resultado da divisão = %.2f%n", divisao);
            }
            else {
                System.out.println("Impossivel dividir");
            }
        }
    }
}