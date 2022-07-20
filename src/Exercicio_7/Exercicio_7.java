package Exercicio_7;

import java.util.Scanner;

public class Exercicio_7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor");
        double valor = sc.nextDouble();

        if (valor >= 0 && valor <= 25){
            System.out.println("Faixa entre 0 e 25");
        }
        if (valor > 25 && valor <= 50){
            System.out.println("Faixa entre 25 e 50");
        }
        if (valor > 50 && valor <= 75){
            System.out.println("Faixa entre 50 e 75");
        }
        if (valor > 75 && valor <= 100){
            System.out.println("Faixa entre 75 e 100");
        }
    }
}