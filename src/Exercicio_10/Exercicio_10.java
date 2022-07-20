package Exercicio_10;

import java.util.Scanner;

public class Exercicio_10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a hora inicial");
        double horaInicial = sc.nextDouble();
        System.out.println("Digite a hora final");
        double horaFinal = sc.nextDouble();

        if (horaInicial == horaFinal) {
            System.out.println("24 Horas");
        }
        else if (horaFinal < horaInicial) {
            double horaTotal = ((24 - horaInicial) + horaFinal);
            System.out.println(horaTotal);
        }
        else {
            double horaTotal = (horaFinal - horaInicial);
            System.out.println(horaTotal);
        }
    }
}