import java.util.ArrayList;

public class Carrinho {

    private ArrayList<Produto> itens;

    public Carrinho() {

        this.itens = new ArrayList<>();
    }

    public void remover(int id ){

        for(int i = 0 ; i < itens.size();i++){

            Produto p = itens.get(i);

            if (p.getId() == id){

                itens.remove(i);
                System.out.println("Item removido do carrinho");

                return;
            }
        }

        System.out.println("Item não encontrado, tente novamente");
    }

    public void adicionar(Produto p){

        itens.add(p);
        System.out.println("Item adicionado.");
    }

    public void vizualizarCarrinho(){

        if (itens.isEmpty()){
            System.out.println("Carrinho vazio!");
           return;
        }

        for (Produto p : itens) {
            System.out.println(p);
        }
    }

    public double calcularTotal(){

        double soma = 0;
        for(Produto p : itens){
            soma += p.getPreco();
        }
        return soma;
    }

    public ArrayList<Produto> getItens() {
        return itens;
    }

}
