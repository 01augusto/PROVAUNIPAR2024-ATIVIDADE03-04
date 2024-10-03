import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<Integer, String> candidatos = new HashMap<>();
        candidatos.put(99, "Taffe");
        candidatos.put(88, "Rodrigo");
        candidatos.put(77, "Lucas");
        candidatos.put(66, "Alessandro");


        System.out.print("Quantas pessoas irão votar? ");
        int quantidadeVotantes = scanner.nextInt();


        Map<Integer, Integer> votos = new HashMap<>();
        for (Integer numero : candidatos.keySet()) {
            votos.put(numero, 0);
        }


        for (int i = 1; i <= quantidadeVotantes; i++) {
            System.out.println("\nVotante " + i + ":");
            System.out.println("Candidatos:");
            for (Map.Entry<Integer, String> candidato : candidatos.entrySet()) {
                System.out.println(candidato.getKey() + " - " + candidato.getValue());
            }

            int voto;
            while (true) {
                System.out.print("Digite o número do candidato que deseja votar: ");
                voto = scanner.nextInt();


                if (candidatos.containsKey(voto)) {
                    votos.put(voto, votos.get(voto) + 1);
                    break;
                } else {
                    System.out.println("Voto inválido! Tente novamente.");
                }
            }
        }

        System.out.println("\nResultados da eleição:");
        int maxVotos = -1;
        int vencedor = -1;

        for (Map.Entry<Integer, Integer> entry : votos.entrySet()) {
            System.out.println("Candidato " + candidatos.get(entry.getKey()) + " recebeu " + entry.getValue() + " votos.");
            if (entry.getValue() > maxVotos) {
                maxVotos = entry.getValue();
                vencedor = entry.getKey();
            }
        }

        System.out.println("\nO vencedor da eleição é " + candidatos.get(vencedor) + " com " + maxVotos + " votos!");

        scanner.close();
    }
}

//Mensagem subliminar-Cleiton melhor professor, não da pro Rodrigo//