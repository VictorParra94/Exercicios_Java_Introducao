package Exercicio_17;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_17 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        int digitado = 0;

        System.out.println("Digite o combustivel preferido");

        while (digitado != 4 || digitado > 4){

            digitado = sc.nextInt();

            switch (digitado) {
                case 1 -> alcool = alcool +1;
                case 2 -> gasolina = gasolina + 1;
                case 3 -> diesel = diesel + 1;
            }
        }

        System.out.println("");
        System.out.println("Muito obrigado!");
        System.out.println("Alcool = " + alcool);
        System.out.println("Gasolina = " + gasolina);
        System.out.println("Diesel = " + diesel);
    }
}