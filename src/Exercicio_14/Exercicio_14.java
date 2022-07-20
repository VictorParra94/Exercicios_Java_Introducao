package Exercicio_14;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_14 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor");
        double valor = sc.nextDouble();
        double desconto = (valor<50) ? valor * 0.90 : valor * 0.50;
        System.out.println(desconto);

    }
}