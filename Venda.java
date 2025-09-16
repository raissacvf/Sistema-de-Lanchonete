import java.util.ArrayList;

public class Venda {
    private ArrayList<Item> itensVendidos = new ArrayList<>();
    private double valorTotal;

    public Venda(ArrayList<Item> itens){
        itensVendidos.addAll(itens);
        for (Item i : itens){
            valorTotal += i.getPreco();
        }
    }

    public void mostrarVenda(){
        System.out.println("=== Venda Realizada ===");
        for (Item i : itensVendidos){
            System.out.println(i);
        }
        System.out.println("Total da venda: R$ " + valorTotal);
    }

    public double getValorTotal(){
        return valorTotal;
    }
}
