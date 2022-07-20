package Exercicio_9;

import java.util.Scanner;

public class Exercicio_9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double cachorro = 1;
        double salada = 2;
        double bacon = 3;
        double torrada = 4;
        double refrigerante = 5;
        double valor;

        System.out.println("Digite o código do item");
        double codigo = sc.nextDouble();
        System.out.println("Digite a quantidade de itens");
        double quantidade = sc.nextDouble();


        if (codigo == cachorro) {
            valor = (4.00 * quantidade);
            System.out.println("valor = R$" + valor);
        }
        else if (codigo == salada) {
            valor = (4.50 * quantidade);
            System.out.println("valor = R$" + valor);
        }
        else if (codigo == bacon) {
            valor = (5.00 * quantidade);
            System.out.println("valor = R$" + valor);
        }
        else if (codigo == torrada) {
            valor = (2.00 * quantidade);
            System.out.println("valor = R$" + valor);
        }
        else if (codigo == refrigerante) {
            valor = (1.50 * quantidade);
            System.out.println("valor = R$" + valor);
        }
    }
}