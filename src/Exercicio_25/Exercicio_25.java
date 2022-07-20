package Exercicio_25;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_25 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char opcao;

        do {
            System.out.print("Digite a temperatura em Celsius = ");
            double celsius = sc.nextDouble();
            double fahrenheit = (((9 * celsius) / 5) + 32);
            System.out.println("Valor em Fahrenheit = " + fahrenheit);
            System.out.print("Continuar? s/n = ");
            opcao = sc.next().charAt(0);
        } while (opcao == 's');







    }
}