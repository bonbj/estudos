package dio.exercicios.estruturas_de_repeticao_e_arrays_em_java.exerciciosDoCurso;
import java.util.Scanner;
/*
Desenvolva um gerador de tabuada, capaz de gerar a tabuada de 
qualquer número inteiro entre 1 a 10. O usuário deve informar de 
qual numero ele deseja ver a tabuada. A saída deve ser conforme o 
exemplo abaixo:
Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/

public class Tabuada {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int numero = console.nextInt();

        for(int i = 1; i < 11; i++) {
            System.out.println(numero + " X " + i + " = " + (i * numero));
        }

        console.close();
    }
}
