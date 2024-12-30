package dio.exercicios.estruturas_de_repeticao_e_arrays_em_java.exerciciosDoCurso;
import java.util.Objects;
import java.util.Scanner;

/*
    -- Faça um programa que leia conjuntos de dois valores, o primeiro representando o nome do aluno
    -- e o segundo representando a sua idade. (Pare o programa inserindo o valor 0 no campo nome)

OSB: não diz nada sobre guardar os valores, apenas pegar, na data que estou a fazer esse exercício 19/12/2024,
Dessa forma vou assumir que preciso mostrar todos os valores
*/

public class NomeEIdade {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String nomeAluno = "";
        int idadeAluno = 0;

        nomeAluno = console.next();

        while (!Objects.equals(nomeAluno, "0")) {
            idadeAluno = console.nextInt();

            System.out.println("Nome do Aluno: " + nomeAluno);
            System.out.println("Idade do Aluno: " + idadeAluno);

            nomeAluno = console.next();
        }

        console.close();
    }
}
