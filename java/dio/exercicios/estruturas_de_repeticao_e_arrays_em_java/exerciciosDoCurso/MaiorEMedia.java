package dio.exercicios.estruturas_de_repeticao_e_arrays_em_java.exerciciosDoCurso;

import java.util.Scanner;

/*
Faça um programa que leia 5 números e informe o maior número e a média desses números.
*/

public class MaiorEMedia {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int numeros = 0;
        int maior = 0;
        int media = 0;
        int numeroDigitado = 0;

        do {
            numeroDigitado = console.nextInt();

            if (maior < numeroDigitado) {
                maior = numeroDigitado;
            }

            media += numeroDigitado;

            ++numeros;
        } while (numeros < 5);

        System.err.println("Maior número: " + maior);
        System.err.println("Média dos números: " + media/5);

        console.close();
    }
}
