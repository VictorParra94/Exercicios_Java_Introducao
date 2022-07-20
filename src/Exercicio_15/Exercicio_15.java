package Exercicio_15;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_15 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int senhaCorreta = 2002;
        int senhaDigitada;

        System.out.println("Digite a Senha");
        senhaDigitada = sc.nextInt();

        while (senhaDigitada != senhaCorreta) {
            System.out.println("Senha incorreta, tente novamente");
            senhaDigitada = sc.nextInt();
        }
        System.out.println("Senha correta, acesso liberado");
    }
}