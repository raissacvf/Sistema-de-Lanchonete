import java.util.ArrayList;

public class Carrinho {
    private ArrayList<Item> items = new ArrayList<>();

    public void adicionarItem(Item item){
        items.add(item);
    }

    public void removerItem(Item item){
        items.remove(item);
    }

    public double calcularPreco(){
        double valor = 0;
        for (Item i : items){
            valor += i.getPreco();
        }
        return valor;
    }

    public void mostrarCarrinho(){
        if(items.isEmpty()){
            System.out.println("Carrinho vazio!");
        } else {
            for (Item i : items){
                System.out.println(i);
            }
            System.out.println("Total: R$ " + calcularPreco());
        }
    }

    public ArrayList<Item> getItems(){
        return items;
    }
}
