package Exercicio_24;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_24 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero de linhas");
        int n = sc.nextInt();;

        for (int i = 1; i <= n; i++) {

            int primeiro = i;
            int segundo = i * i;
            int terceiro = i * i * i;

            System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);

        }
    }
}