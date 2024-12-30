package dio.exercicios.estruturas_de_repeticao_e_arrays_em_java.exerciciosDoCurso;
import java.util.Scanner;
import java.util.Arrays;

/*
Faça um Programa que leia um vetor de 6 caracteres, e diga quantas consoantes foram lidas. Imprima as consoantes.
*/

public class Consoantes {
    public static void main(String[] args) {
        char[] letras = new char[6];
        Scanner console = new Scanner(System.in);
        String[] vogais = {"a", "e", "i", "o", "u", "A", "E", "I", "O", "U"};

        for(int i = 0; i < 6; i++) {
            String capturado = console.next();
            letras[i] = capturado.charAt(0);
        }

        int qtdConsoantes = 0;

        for(int i = 0; i < 6; i++) {
            if (!Arrays.asList(vogais).contains("" + letras[i])) {
                qtdConsoantes++;
                System.out.print(letras[i] + " ");
            }
        }

        System.err.println("");
        System.err.println("Quantidade de consoantes: " + qtdConsoantes);

        console.close();
    }
}
