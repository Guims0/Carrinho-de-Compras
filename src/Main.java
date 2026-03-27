import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Carrinho carrinho = new Carrinho();
        ArrayList<Produto> vitrine = new ArrayList<>();

        vitrine.add(new Produto("Notebook Dell",1,3500.0));
        vitrine.add(new Produto("Mouse sem fio",2,120.0));
        vitrine.add(new Produto("Teclado Mecânico",3,250.0));
        vitrine.add(new Produto("Monitor 24 polegadas",4, 800.00));
        vitrine.add(new Produto("Headset Gamer com Microfone",5, 350.00));

        int opcao = -1,escolha;

        System.out.println(" <<< VITRINE DE PRODUTOS >>> ");
        System.out.println("""
               ID: 1 | Notebook Dell               - R$ 3500.00
               ID: 2 | Mouse sem fio               - R$ 120.00
               ID: 3 | Teclado Mecânico            - R$ 250.00
               ID: 4 | Monitor 24 polegadas        - R$ 800.00
               ID: 5 | Headset Gamer com Microfone - R$ 350.00
               """);

        while (opcao != 0 ) {
            System.out.println("""
                     selecione a opção:
                     1 | adicionar produto no carrinho 
                     2 | remover produto do carrinho
                     3 | vizualizar carrinho
                     4 | ir para pagamento
                     0 | Fechar programa  
                    """);
            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:

                    System.out.println("Escolha o numero do produto que voce quer adicionar no carrinho:");
                    System.out.println("""
                           ID: 1 | Notebook Dell               - R$ 3500.00
                           ID: 2 | Mouse sem fio               - R$ 120.00
                           ID: 3 | Teclado Mecânico            - R$ 250.00
                           ID: 4 | Monitor 24 polegadas        - R$ 800.00
                           ID: 5 | Headset Gamer com Microfone - R$ 350.00
                           """);
                    escolha = scanner.nextInt();
                    boolean encontrado = false;
                    for (Produto p : vitrine){
                        if (escolha == p.getId()){
                            carrinho.adicionar(p);
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado){
                        System.out.println("Numero errado, tente novamente.");
                    }
                    break;

                case 2:
                    carrinho.vizualizarCarrinho();
                    if (!carrinho.getItens().isEmpty()) {
                        System.out.println("Qual item quer remover? ");
                        System.out.println("Digite seu id ");
                        escolha = scanner.nextInt();
                        carrinho.remover(escolha);
                    }
                    break;
                case 3:
                    carrinho.vizualizarCarrinho();
                    break;

                case 4:
                    double valorTotal = carrinho.calcularTotal();

                    if (valorTotal == 0 ){
                        System.out.println("Seu carrinho está vazio. Adicione produtos antes de finalizar.");
                        break;
                    }
                    System.out.println("<<< FINALIZANDO COMPRA >>>");
                    System.out.println("Total: R$ " + valorTotal);
                    System.out.println("Boleto gerado. Obrigado e volte sempre.");
                    opcao = 0;
                    break;
            }
        }
    }
}