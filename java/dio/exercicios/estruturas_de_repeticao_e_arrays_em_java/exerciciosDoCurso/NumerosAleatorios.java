package dio.exercicios.estruturas_de_repeticao_e_arrays_em_java.exerciciosDoCurso;
import java.util.Scanner;

/*
Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100)
armazene-os num vetor. Ao final, mostre os números e seus sucessores.

OBS:: Não entendi o contexto do "mostre os números e seus sucessores" por isso vou está 
    imprimindo os sucessores até 100 a partir do número.
*/

public class NumerosAleatorios {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int[] numeros = new int[20];

        for (int i = 0; i < 20; i++) {
            numeros[i] = console.nextInt();
        }

        for (int i = 0; i < 20; i++) {
            System.out.println("Numero na posição " + i + ": " + numeros[i]);
            System.out.print("Numeros subsequentes: ");
            for (int j = numeros[i]; j < 101; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }


        console.close();
    }
}
