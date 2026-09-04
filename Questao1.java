// Receba a nota final e o total de faltas de um conjunto indeterminado de alunos e imprima:
// a. Quantidade de alunos com nota final >= 90
// b. Quantidade de alunos reprovados por nota (<70) ou falta (>=20)
// c. Maior e menor nota
// d. Média de notas da turma
// O programa termina quando o usuário informar uma nota negativa.

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        double nota, maiorNota = -1, menorNota = 11, somaNotas = 0;
        int faltas;
        int totalAlunos = 0, qtdNotaMaiorIgual90 = 0, qtdReprovados = 0;

        System.out.print("Digite a nota final do aluno (negativa para encerrar): ");
        nota = input.nextDouble();

        while (nota >= 0) {

            System.out.print("Digite o total de faltas do aluno: ");
            faltas = input.nextInt();

            totalAlunos++;
            somaNotas = somaNotas + nota;

            // a) Conta quem tirou nota >= 90
            if (nota >= 90) {
                qtdNotaMaiorIgual90++;
            }

            // b) Conta reprovados por nota ou por falta
            if (nota < 70 || faltas >= 20) {
                qtdReprovados++;
            }

            // c) Verifica maior e menor nota
            if (nota > maiorNota) {
                maiorNota = nota;
            }

            if (nota < menorNota) {
                menorNota = nota;
            }

            System.out.print("Digite a nota final do aluno (negativa para encerrar): ");
            nota = input.nextDouble();
        }

        System.out.println();

        if (totalAlunos > 0) {
            double media = somaNotas / totalAlunos;

            System.out.println("Alunos com nota >= 90: " + qtdNotaMaiorIgual90);
            System.out.println("Alunos reprovados (nota ou falta): " + qtdReprovados);
            System.out.println("Maior nota: " + maiorNota);
            System.out.println("Menor nota: " + menorNota);
            System.out.println("Média da turma: " + media);
        } else {
            System.out.println("Nenhum aluno foi informado.");
        }

        input.close();

    }
}