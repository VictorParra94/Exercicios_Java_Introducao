package Exercicio_2;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_2 {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do Raio");
        double raio = sc.nextDouble();
        double pi = 3.14159;

        double area = pi * (raio * raio);

        System.out.printf("Area = %.4f", area);


    }
}