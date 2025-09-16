import java.util.ArrayList;

public class Cardapio {
    private ArrayList<Item> itens = new ArrayList<>();

    public void adicionarItem(Item item){
        itens.add(item);
    }

    public void mostrarCardapio(){
        System.out.println("=== Cardápio ===");
        for (int i = 0; i < itens.size(); i++){
            System.out.println((i+1) + ". " + itens.get(i));
        }
    }

    public Item getItem(int index){
        if(index >= 0 && index < itens.size()){
            return itens.get(index);
        }
        return null;
    }
}
