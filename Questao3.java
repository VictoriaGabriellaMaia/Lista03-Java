// Pesquisa de audiência de canais de TV (2, 4, 5, 7, 12).
// Lê canal e número de pessoas assistindo, calcula o percentual de audiência de cada canal.
// Encerra quando o número do canal for igual a ZERO.

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int canal, pessoas;
        int totalPessoas = 0;
        int canal2 = 0, canal4 = 0, canal5 = 0, canal7 = 0, canal12 = 0;

        System.out.print("Digite o número do canal -> 2, 4, 5, 7 ou 12 (0 para encerrar): ");
        canal = input.nextInt();

        while (canal != 0) {

            System.out.print("Digite o número de pessoas assistindo a este canal: ");
            pessoas = input.nextInt();

            if (canal == 2) {
                canal2 = canal2 + pessoas;
                totalPessoas = totalPessoas + pessoas;
            } else if (canal == 4) {
                canal4 = canal4 + pessoas;
                totalPessoas = totalPessoas + pessoas;
            } else if (canal == 5) {
                canal5 = canal5 + pessoas;
                totalPessoas = totalPessoas + pessoas;
            } else if (canal == 7) {
                canal7 = canal7 + pessoas;
                totalPessoas = totalPessoas + pessoas;
            } else if (canal == 12) {
                canal12 = canal12 + pessoas;
                totalPessoas = totalPessoas + pessoas;
            } else {
                System.out.println("Canal inválido! Os canais disponíveis são: 2, 4, 5, 7, 12");
            }

            System.out.print("Digite o número do canal -> 2, 4, 5, 7 ou 12 (0 para encerrar): ");
            canal = input.nextInt();
        }

        System.out.println();

        if (totalPessoas > 0) {
            double percCanal2 = (canal2 * 100.0) / totalPessoas;
            double percCanal4 = (canal4 * 100.0) / totalPessoas;
            double percCanal5 = (canal5 * 100.0) / totalPessoas;
            double percCanal7 = (canal7 * 100.0) / totalPessoas;
            double percCanal12 = (canal12 * 100.0) / totalPessoas;

            System.out.println("Percentual de audiência:");
            System.out.println("Canal 2: " + percCanal2 + "%");
            System.out.println("Canal 4: " + percCanal4 + "%");
            System.out.println("Canal 5: " + percCanal5 + "%");
            System.out.println("Canal 7: " + percCanal7 + "%");
            System.out.println("Canal 12: " + percCanal12 + "%");
        } else {
            System.out.println("Nenhuma audiência foi registrada.");
        }

        input.close();

    }
}