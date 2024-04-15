import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Pedidos lista = new Pedidos();
        Scanner scanner = new Scanner(System.in);
        String acao;

        do {
            System.out.println("\nDigite '+' para adicionar um pedido à lista,");
            System.out.println("Digite '-' para remover um pedito da lista,");
            System.out.println("Digite 'listar' para ver os pedidos,");
            System.out.println("Digite 'sair' para sair do aplicativo.");
            System.out.print("ação: ");
            acao = scanner.nextLine();

            switch (acao.toLowerCase()) {
                case "+":
                    System.out.print("Digite o pedidoa a ser adicionado: ");
                    String itemAdicionar = scanner.nextLine();
                    lista.adicionar(itemAdicionar);
                    break;
                case "-":
                    System.out.print("Digite o pedido a ser removido: ");
                    String itemRemover = scanner.nextLine();
                    lista.remover(itemRemover);
                    break;
                case "listar":
                    lista.exibirListar();
                    break;
                case "sair":
                    System.out.println("Encerrando o aplicativo.");
                    break;
                default:
                    System.out.println(" inválido.");
            }
        } while (!acao.equalsIgnoreCase("sair"));

        scanner.close();
    }

}