package Exercicio_13;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_13 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero do dia");
        int numeroDia = sc.nextInt();
        String dia;

        switch (numeroDia) {
            case 1 -> dia = "domingo";
            case 2 -> dia = "segunda";
            case 3 -> dia = "terça";
            case 4 -> dia = "quarta";
            case 5 -> dia = "quinta";
            case 6 -> dia = "sexta";
            case 7 -> dia = "sabado";
            default -> dia = "indeterminado";
        }
        System.out.println("Dia = " + dia);

    }
}