package Exercicio_6;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_6 {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de 'A'");
        double A = sc.nextDouble();
        System.out.println("Digite o valor de 'B'");
        double B = sc.nextDouble();
        System.out.println("Digite o valor de 'C'");
        double C = sc.nextDouble();

        double pi = 3.14159;

        double areaTriangulo = (A*C)/2;
        double areaCirculo = pi * (C*C);
        double areaTrapezio = ((A+B)/2)*C;
        double areaQuadrado = B*B;
        double areaRetangulo = A*B;

        System.out.println();
        System.out.printf("Area do Triangulo = %.3f%n", areaTriangulo);
        System.out.printf("Area do Circulo = %.3f%n", areaCirculo);
        System.out.printf("Area do Trapézio = %.3f%n", areaTrapezio);
        System.out.printf("Area do Quadrado = %.3f%n", areaQuadrado);
        System.out.printf("Area do Retangulo = %.3f%n", areaRetangulo);


    }
}