package dio.exercicios.estruturas_de_repeticao_e_arrays_em_java.exerciciosDoCurso;

import java.util.Scanner;

/*
Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido 
e continue pedindo até que o usuário informe um valor válido.

OBS: como na pergunta não fala nada sobre o que fazer com o valor, vou está imprimindo no console
*/

public class Nota {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int nota = -1;
        nota = console.nextInt();
        
        while (nota < 0 || nota > 10) {
            System.out.println("Nota Inválida");
            nota = console.nextInt();
        }
        
        System.out.println("Nota digitada: " + nota);

        console.close();
    }
}
