package dio.exercicios.estruturas_de_repeticao_e_arrays_em_java.exerciciosDoCurso;
import java.util.Scanner;

/*
Faça um Programa que leia um vetor de 5 números inteiros e mostre-os na ordem inversa.
*/

public class OrdemInversa {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        Scanner console = new Scanner(System.in);

        for(int i = 0; i < 5; i++) {
            numeros[i] = console.nextInt();
        }

        for(int i = 4; i > -1; i--) {
            System.err.println(numeros[i]);
        }

        console.close();
    }
}
