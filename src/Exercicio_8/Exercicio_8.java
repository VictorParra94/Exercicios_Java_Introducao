package Exercicio_8;

import java.util.Scanner;

public class Exercicio_8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero");
        double numero = sc.nextDouble();

        if (numero % 2 == 0) {
            System.out.println("Numero Par");
        }
        else {
            System.out.println("Numero Impar");
        }

    }
}