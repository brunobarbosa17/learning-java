public class Produto {
    private double preco;
    private String descricao;
    private int id;

    public Produto(double preco, String descricao, int id) {
        this.preco = preco;
        this.descricao = descricao;
        this.id = id;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



}
