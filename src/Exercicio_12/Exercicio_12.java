package Exercicio_12;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_12 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do Salario");
        double salario = sc.nextDouble();

        if (salario <= 2000) {
            System.out.println("Isento de Impostos");
        }
        else if (salario > 2000 && salario <= 3000) {
            double imposto = ((salario - 2000) * 0.08);
            System.out.println("Impostos = R$" + imposto);
        }
        else if (salario > 3000 && salario <= 4500) {
            double imposto = 80 + ((salario - 3000) * 0.18);
            System.out.println("Impostos = R$" + imposto);
        }
        else if (salario > 4500) {
            double imposto = 270 + 80 + ((salario - 4500) * 0.28);
            System.out.println("Impostos = R$" + imposto);
        }
    }
}