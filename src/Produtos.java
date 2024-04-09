import java.awt.*;

public class Produtos {
    private Integer id;
    private String nome;
    private Double preco;
    private Integer qtdEstoque;


    public Produtos() {
    }

    public Produtos(Integer id,String nome, Double preco, Integer qtdEstoque) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoqueInicial(Integer qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return " " +
                "\nid: " + id +
                "\nnome: " + nome  +
                "\npreco: " + preco +
                "\nqtdEstoqueInicial: " + qtdEstoque +
                "\n==================";
    }


    public void saidaEstoque(int qtd){
        this.qtdEstoque -= qtd;
    }

}
