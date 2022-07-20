package Exercicio_5;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_5 {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o codigo da peça 1");
        int codigoPeca_1 = sc.nextInt();
        System.out.println("Digite o numero de peças 1");
        double numeroPeca_1 = sc.nextDouble();
        System.out.println("Digite o preço da peça 1");
        double precoPeca_1 = sc.nextDouble();
        System.out.println("Digite o codigo da peça 2");
        int codigoPeca_2 = sc.nextInt();
        System.out.println("Digite o numero de peças 2");
        double numeroPeca_2 = sc.nextDouble();
        System.out.println("Digite o preço da peça 2");
        double precoPeca_2 = sc.nextDouble();

        double valorPeca_1 = numeroPeca_1 * precoPeca_1;
        double valorPeca_2 = numeroPeca_2 * precoPeca_2;
        double valorTotal = valorPeca_1 + valorPeca_2;

        System.out.println();
        System.out.println("Codigo da peça 1 = " + codigoPeca_1);
        System.out.println("Valor peça 1 = R$" + valorPeca_1);
        System.out.println();
        System.out.println("Codigo da peça 2 = " + codigoPeca_2);
        System.out.println("Valor peça 2 = R$" + valorPeca_2);
        System.out.println();
        System.out.println("Valor total = R$" + valorTotal);


    }
}