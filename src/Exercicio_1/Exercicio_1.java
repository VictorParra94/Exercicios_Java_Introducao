package Exercicio_1;

import java.util.Scanner;

public class Exercicio_1 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor");
        double primeiroValor = sc.nextDouble();
        System.out.println("Digite o Segundo valor");
        double segundoValor = sc.nextDouble();

        double soma = primeiroValor + segundoValor;

        System.out.println("SOMA = " + soma);

    }
}