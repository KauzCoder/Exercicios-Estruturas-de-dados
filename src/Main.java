import java.util.Scanner;

public class Main {
    public static void main(String[] args ) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Media programaNotas = new Media();
        Idades programaIdades = new Idades();

        int[] listaIdades = null;
        int opcao = 0;
        boolean rodando = true;

        System.out.println("\n" +
                "███████╗░██████╗████████╗██████╗░██╗░░░██╗████████╗██╗░░░██╗██████╗░░█████╗░  ██████╗░███████╗\n" +
                "██╔════╝██╔════╝╚══██╔══╝██╔══██╗██║░░░██║╚══██╔══╝██║░░░██║██╔══██╗██╔══██╗  ██╔══██╗██╔════╝\n" +
                "█████╗░░╚█████╗░░░░██║░░░██████╔╝██║░░░██║░░░██║░░░██║░░░██║██████╔╝███████║  ██║░░██║█████╗░░\n" +
                "██╔══╝░░░╚═══██╗░░░██║░░░██╔══██╗██║░░░██║░░░██║░░░██║░░░██║██╔══██╗██╔══██║  ██║░░██║██╔══╝░░\n" +
                "███████╗██████╔╝░░░██║░░░██║░░██║╚██████╔╝░░░██║░░░╚██████╔╝██║░░██║██║░░██║  ██████╔╝███████╗\n" +
                "╚══════╝╚═════╝░░░░╚═╝░░░╚═╝░░╚═╝░╚═════╝░░░░╚═╝░░░░╚═════╝░╚═╝░░╚═╝╚═╝░░╚═╝  ╚═════╝░╚══════╝\n" +
                "\n" +
                "██████╗░░█████╗░██████╗░░█████╗░░██████╗  ░░░░░░  ░█████╗░██████╗░██████╗░░█████╗░██╗░░░██╗░██████╗\n" +
                "██╔══██╗██╔══██╗██╔══██╗██╔══██╗██╔════╝  ░░░░░░  ██╔══██╗██╔══██╗██╔══██╗██╔══██╗╚██╗░██╔╝██╔════╝\n" +
                "██║░░██║███████║██║░░██║██║░░██║╚█████╗░  █████╗  ███████║██████╔╝██████╔╝███████║░╚████╔╝░╚█████╗░\n" +
                "██║░░██║██╔══██║██║░░██║██║░░██║░╚═══██╗  ╚════╝  ██╔══██║██╔══██╗██╔══██╗██╔══██║░░╚██╔╝░░░╚═══██╗\n" +
                "██████╔╝██║░░██║██████╔╝╚█████╔╝██████╔╝  ░░░░░░  ██║░░██║██║░░██║██║░░██║██║░░██║░░░██║░░░██████╔╝\n" +
                "╚═════╝░╚═╝░░╚═╝╚═════╝░░╚════╝░╚═════╝░  ░░░░░░  ╚═╝░░╚═╝╚═╝░░╚═╝╚═╝░░╚═╝╚═╝░░╚═╝░░░╚═╝░░░╚═════╝░\n" +
                "\n" +
                "███████╗███╗░░░███╗  ░░░░░██╗░█████╗░██╗░░░██╗░█████╗░  ░█████╗░░█████╗░░░███╗░░\n" +
                "██╔════╝████╗░████║  ░░░░░██║██╔══██╗██║░░░██║██╔══██╗  ██╔══██╗██╔══██╗░████║░░\n" +
                "█████╗░░██╔████╔██║  ░░░░░██║███████║╚██╗░██╔╝███████║  ██║░░██║██║░░██║██╔██║░░\n" +
                "██╔══╝░░██║╚██╔╝██║  ██╗░░██║██╔══██║░╚████╔╝░██╔══██║  ██║░░██║██║░░██║╚═╝██║░░\n" +
                "███████╗██║░╚═╝░██║  ╚█████╔╝██║░░██║░░╚██╔╝░░██║░░██║  ╚█████╔╝╚█████╔╝███████╗\n" +
                "╚══════╝╚═╝░░░░░╚═╝  ░╚════╝░╚═╝░░╚═╝░░░╚═╝░░░╚═╝░░╚═╝  ░╚════╝░░╚════╝░╚══════╝");

        while (rodando) {
            System.out.println("\n");
            System.out.println("╔══════════════════════════════════════════════╗");
            System.out.println("║              📚 MENU PRINCIPAL 📚             ║");
            System.out.println("╠══════════════════════════════════════════════╣");
            System.out.println("║  1 ▸ Cadastrar notas                         ║");
            System.out.println("║  2 ▸ Calcular média aritmética               ║");
            System.out.println("║  3 ▸ Cadastrar idades                        ║");
            System.out.println("║  4 ▸ Exibir idades maiores que 18            ║");
            System.out.println("║  5 ▸ Sair                                    ║");
            System.out.println("╚══════════════════════════════════════════════╝");
            System.out.print("(☞ﾟヮﾟ)☞ Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    programaNotas.dadosArray();
                    System.out.println("\n ↩ Dados informados. Retornando ao menu em 3 segundos...");
                    Thread.sleep(3000);
                    break;
                case 2:
                    programaNotas.mediaAritmetica();
                    System.out.println("\n ↩ Media adquirida. Retornando ao menu em 3 segundos...");
                    Thread.sleep(3000);
                    break;
                case 3:
                    listaIdades = programaIdades.ArrayIdades();
                    System.out.println("\n ↩ Dados informados. Retornando ao menu em 3 segundos...");
                    Thread.sleep(3000);
                    break;
                case 4:
                    if (listaIdades != null) {
                        programaIdades.exibeNumeroMaioresQue18(listaIdades);
                        System.out.println("\n ↩ Numeros obtidos. Retornando ao menu em 3 segundos...");
                        Thread.sleep(3000);
                    } else {
                        System.out.println("\n Nenhuma idade cadastrada ainda!");
                        System.out.println("\n ↩ Retornando ao menu em 3 segundos...");
                        Thread.sleep(3000);
                    }
                    break;

                case 5:
                    System.out.println("\n Programa encerrado. Até logo!");
                    rodando = false;
                    Thread.sleep(3000);
                    break;
                default:
                    System.out.println("\n Opção inválida! Tente novamente.");
            }
        }
    }
}
