package Exercicio_19;

import java.util.Scanner;

public class Exercicio_19 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int in = 0;
        int out = 0;

        System.out.println("Digite a quantidade de valores a serem lidos");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            if (x >= 10 && x <= 20) {
                in += 1;
            }
            else {
                out += 1;
            }
        }

        System.out.println("In = " + in);
        System.out.println("Out = " + out);

    }
}