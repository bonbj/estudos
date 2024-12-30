package dio.exercicios.estruturas_de_repeticao_e_arrays_em_java.exerciciosDoCurso;

import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!=5.4.3.2.1=120
*/

public class Fatorial {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int numero = 0, resultado = 0;

        resultado = console.nextInt();
        numero = resultado;
        --numero;

        for(int i = numero; i > 1; i--) {
            resultado *= i;
        }

        System.err.println("Fatorial de " + (numero+1) + " = " + resultado);

        console.close();
    }
}
