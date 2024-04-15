import java.util.ArrayList;

public class Pedidos {
    private ArrayList<String> itens;


    public Pedidos() {
        this.itens = new ArrayList<>();
    }


    public void adicionar(String item) {

        itens.add(item);
        System.out.println("Item adicionado: " + item);
    }

    public void remover(String item) {
        if (itens.remove(item)) {
            System.out.println("Item removido: " + item);
        } else {
            System.out.println("Item não encontrado na lista.");
        }
    }


    public void exibirListar() {
        System.out.println("Lista de pedidos:");
        for (String item : itens) {
            System.out.println("- " + item);
        }
    }

}
