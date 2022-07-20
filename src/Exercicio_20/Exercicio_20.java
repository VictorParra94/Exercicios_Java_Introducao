package Exercicio_20;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_20 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de medias");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            double media = ((a*2)+(b*3)+(c*5))/10;

            System.out.println("Media = " + media);

        }
    }
}