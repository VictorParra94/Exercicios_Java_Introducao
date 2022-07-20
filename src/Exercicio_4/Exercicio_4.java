package Exercicio_4;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_4 {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero do funcionario");
        double numeroFuncionario = sc.nextDouble();
        System.out.println("Digite o numero de horas trabalhadas");
        double horasTrabalhadas = sc.nextDouble();
        System.out.println("Digite o valor da hora trabalhada");
        double valorHorasTrabalhadas = sc.nextDouble();

        double valorReceber = horasTrabalhadas * valorHorasTrabalhadas;

        System.out.println("Numero do funcionario = " + numeroFuncionario);
        System.out.println("Valor a receber = " + valorReceber);


    }
}