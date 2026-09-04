// Solicite a matrícula e as três notas de um conjunto de alunos.
// Aprovado: média >= 70 | Recuperação: média >= 60 e < 70 | Reprovado: média < 60
// O programa termina quando o usuário informar uma matrícula negativa.

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int matricula;
        double nota1, nota2, nota3, media;

        System.out.print("Digite a matrícula do aluno (negativa para encerrar): ");
        matricula = input.nextInt();

        while (matricula >= 0) {

            System.out.print("Digite a 1° nota: ");
            nota1 = input.nextDouble();

            System.out.print("Digite a 2° nota: ");
            nota2 = input.nextDouble();

            System.out.print("Digite a 3° nota: ");
            nota3 = input.nextDouble();

            media = (nota1 + nota2 + nota3) / 3;

            System.out.print("Matrícula: " + matricula + " | Média: " + media + " | ");

            if (media >= 70) {
                System.out.println("Aprovado");
            } else if (media >= 60 && media < 70) {
                System.out.println("Recuperação");
            } else {
                System.out.println("Reprovado");
            }

            System.out.println();

            System.out.print("Digite a matrícula do aluno (negativa para encerrar): ");
            matricula = input.nextInt();
        }

        input.close();

    }
}