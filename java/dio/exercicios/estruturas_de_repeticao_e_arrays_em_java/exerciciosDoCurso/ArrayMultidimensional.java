package dio.exercicios.estruturas_de_repeticao_e_arrays_em_java.exerciciosDoCurso;
import java.util.concurrent.ThreadLocalRandom;
/*
Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9. 
Após isso determine o menor número da matriz e a sua posição(linha, coluna).
*/

public class ArrayMultidimensional {
    public static void main(String[] args) {
        int[][] numeros = new int[4][4];

        for (int i = 0 ; i < 4 ; i++) {
            for (int j = 0 ; j < 4 ; j++) {
                numeros[i][j] = ThreadLocalRandom.current().nextInt(0, 9);
            }
        }

        int menor = 11;
        String posicao = "";

        for (int i = 0 ; i < 4 ; i++) {
            for (int j = 0 ; j < 4 ; j++) {
                numeros[i][j] = ThreadLocalRandom.current().nextInt(0, 9);

                if (numeros[i][j] < menor) {
                    menor = numeros[i][j];
                    posicao = "" + i  + " : " + j;
                }
            }
        }

        System.out.println("Menor número foi: " + menor);
        System.out.println("Sua posição foi: " + posicao);

        for (int i = 0 ; i < 4 ; i++) {
            for (int j = 0 ; j < 4 ; j++) {
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
