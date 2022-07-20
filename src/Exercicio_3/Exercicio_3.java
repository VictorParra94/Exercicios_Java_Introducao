package Exercicio_3;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_3 {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de 'A'");
        double A = sc.nextDouble();
        System.out.println("Digite o valor de 'B'");
        double B = sc.nextDouble();
        System.out.println("Digite o valor de 'C'");
        double C = sc.nextDouble();
        System.out.println("Digite o valor de 'D'");
        double D = sc.nextDouble();

        double diferenca = ((A+B) - (C+D));

        System.out.printf("Diferença = " + diferenca);

    }
}