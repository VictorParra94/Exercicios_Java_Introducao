package Exercicio_18;

import java.util.Scanner;

public class Exercicio_18 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int valor = sc.nextInt();
        int i;

        for (i = 0; i <= valor; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }
}