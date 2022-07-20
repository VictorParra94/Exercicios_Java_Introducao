package Exercicio_16;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_16 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os valores de X/Y");
        int x = sc.nextInt(); int y = sc.nextInt();

        while (x != 0 && y != 0){
            if (x > 0 && y > 0){
                System.out.println("Primeiro Quadrante");
            }
            else if (x < 0 && y > 0) {
                System.out.println("Segundo Quadrante");
            }
            else if (x < 0 && y < 0){
                System.out.println("Terceito Quadrante");
            }
            else if (x > 0 && y < 0) {
                System.out.println("Quarto Quadrante");
            }
            x = sc.nextInt(); y = sc.nextInt();
        }
        System.out.println("Erro, o numero não pode ser zero");
    }
}