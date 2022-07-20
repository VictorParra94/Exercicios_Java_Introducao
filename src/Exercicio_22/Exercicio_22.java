package Exercicio_22;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_22 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor para ser fatorial");
        int n = sc.nextInt();
        int fatorial = 1;

        for (int i=1; i<=n; i++) {
            fatorial = fatorial * i;
            System.out.println(fatorial);

        }
    }
}