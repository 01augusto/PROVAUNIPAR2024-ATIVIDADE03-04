import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos filmes você deseja avaliar? ");
        int quantidadeFilmes = scanner.nextInt();


        if (quantidadeFilmes <= 0) {
            System.out.println("A quantidade de filmes deve ser maior que zero.");
            return;
        }

        String[] titulos = new String[quantidadeFilmes];
        double[] avaliacoes = new double[quantidadeFilmes];

        for (int i = 0; i < quantidadeFilmes; i++) {
            System.out.print("Digite o título do filme " + (i + 1) + ": ");
            scanner.nextLine();
            titulos[i] = scanner.nextLine();
        }

        int filmesBons = 0;
        int filmesRuins = 0;
        double somaAvaliacoes = 0;

        for (int i = 0; i < quantidadeFilmes; i++) {
            double nota;
            while (true) {
                System.out.print("Digite a nota para o filme '" + titulos[i] + "' (0 a 10): ");
                nota = scanner.nextDouble();

                if (nota >= 0 && nota <= 10) {
                    break;
                } else {
                    System.out.println("Nota inválida. Deve estar entre 0 e 10.");
                }
            }

            avaliacoes[i] = nota;
            somaAvaliacoes += nota;

            if (nota >= 6) {
                filmesBons++;
            } else {
                filmesRuins++;
            }
        }

        double mediaAvaliacoes = somaAvaliacoes / quantidadeFilmes;

        System.out.printf("Média das avaliações:", mediaAvaliacoes);
        System.out.println("Quantidade de filmes avaliados como bons: " + filmesBons);
        System.out.println("Quantidade de filmes avaliados como ruins: " + filmesRuins);

        scanner.close();
    }
}
