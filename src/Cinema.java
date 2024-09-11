import java.util.ArrayList;
import java.util.Scanner;

public class Cinema {

    private static ArrayList<Sessao> sessoes = new ArrayList<Sessao>(5);
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        boolean programaRodando = true;

        while (programaRodando == true) {
            System.out.println("Menu: ");
            System.out.println("1 - Cadastrar: ");
            System.out.println("2 - Vender:");
            System.out.println("3 - Sair: ");
            System.out.println("Digite a opção: ");

            int opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao) {
                case 1:
                    Cadastrar();

                    break;
                case 2:
                    vender();
                    break;

                case 3:
                    programaRodando = false;
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
        scan.close();
    }

    public static void Cadastrar() {
        for (int i = 0; i < 5; i++) {

            System.out.println("Digite o nome do filme: ");
            String nome = scan.nextLine();
            

            System.out.println("Digite o horário do filme: ");
            String horario = scan.nextLine();
            

            System.out.println("Cadastrando sessão...\n");

            Assento assento = new Assento();
            Sessao sessao = new Sessao(nome, horario, assento);
            sessoes.add(sessao);
        }

    }

    public static void vender() {
        if (sessoes.isEmpty()) {
            System.out.println("Nenhuma sessão disponivel.\n");
            return;
        } else {
            System.out.println("\nSessões disponiveis: ");
            for (int i = 0; i < sessoes.size(); i++) {
                System.out.println((i + 1) + " - Filme: " + sessoes.get(i).getNome() + " | Horário: " + sessoes.get(i).getHorario());

            }
            System.out.println("Escolha a sessão (1 a 5): ");
            int sessaoEscolhida = scan.nextInt() - 1;

            System.out.println("Mapa de assentos: ");
            System.out.println(sessoes.get(sessaoEscolhida).mostraLugares());

            System.out.println("Escolha a fila de 0 a 4: ");
            int fila = scan.nextInt();

            System.out.println("Escolha o assento de 0 a 3");
            int assento = scan.nextInt();

            if (sessoes.get(sessaoEscolhida).vender(fila, assento)) {
                System.out.println("Venda realizada com sucesso!\n ");
            } else {
                System.out.println("Assento já ocupado.\n");
            }
            //scan.close();
        }
    }
}
