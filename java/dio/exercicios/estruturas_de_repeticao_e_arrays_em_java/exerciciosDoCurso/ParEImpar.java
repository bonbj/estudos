package dio.exercicios.estruturas_de_repeticao_e_arrays_em_java.exerciciosDoCurso;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros. Calcule e mostre 
a quantidade de números pares e a quantidade de números impares.
*/

public class ParEImpar {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int casos = 0, 
        iteracoes = 0,
        pares = 0,
        impares = 0,
        valorPego = 0;

        casos = console.nextInt();

        do {

            valorPego = console.nextInt();

            if(valorPego % 2 == 0) {
                pares++;
            } else {
                impares++;
            }

            ++iteracoes;
        } while(iteracoes < casos);

        System.err.println("Quantidade de números impares: " + impares);
        System.err.println("Quantidade de números pares: " + pares);
        
        console.close();
    }
}
