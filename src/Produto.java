
public class Produto {

    private String nome;
    private  Integer id;
    private Double preco;

    public Produto(String nome, Integer id, Double preco) {
        this.nome = nome;
        this.id = id;
        this.preco = preco;
    }

    public Produto(){}

    public String getNome() {
        return nome;
    }

    public Integer getId() {
        return id;
    }

    public Double getPreco() {
        return preco;
    }


}
