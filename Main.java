import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cardapio cardapio = new Cardapio();
        cardapio.adicionarItem(new Item("Hamburguer", 15.0));
        cardapio.adicionarItem(new Item("Batata Frita", 10.0));
        cardapio.adicionarItem(new Item("Refrigerante", 7.0));

        Carrinho carrinho = new Carrinho();
        ArrayList<Venda> vendas = new ArrayList<>();

        int opcao;
        do {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Mostrar Cardápio");
            System.out.println("2. Adicionar Item ao Carrinho");
            System.out.println("3. Mostrar Carrinho");
            System.out.println("4. Finalizar Compra");
            System.out.println("5. Relatório de Vendas");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    cardapio.mostrarCardapio();
                    break;
                case 2:
                    cardapio.mostrarCardapio();
                    System.out.print("Escolha o item: ");
                    int escolha = sc.nextInt() - 1;
                    Item itemEscolhido = cardapio.getItem(escolha);
                    if (itemEscolhido != null) {
                        carrinho.adicionarItem(itemEscolhido);
                        System.out.println(itemEscolhido.getNome() + " adicionado!");
                    } else {
                        System.out.println("Opção inválida.");
                    }
                    break;
                case 3:
                    carrinho.mostrarCarrinho();
                    break;
                case 4:
                    if(carrinho.getItems().isEmpty()){
                        System.out.println("Carrinho vazio!");
                    } else {
                        Venda venda = new Venda(carrinho.getItems());
                        vendas.add(venda);
                        venda.mostrarVenda();
                        carrinho = new Carrinho(); // limpa carrinho
                    }
                    break;
                case 5:
                    System.out.println("=== Relatório de Vendas ===");
                    double totalVendas = 0;
                    for (Venda v : vendas){
                        v.mostrarVenda();
                        totalVendas += v.getValorTotal();
                    }
                    System.out.println("Faturamento total: R$ " + totalVendas);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while(opcao != 0);

        sc.close();
    }
}
