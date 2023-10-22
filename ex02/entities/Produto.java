package ex02.entities;

public abstract class Produto {
    protected int codigo;
    protected String nome;
    protected int qtd;
    protected double preco;

    public Produto(int codigo, int qtd, String nome, double preco) {
        this.codigo = codigo;
        this.qtd = qtd;
        this.nome = nome;
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getQtd() {
        return qtd;
    }

    public double getPreco() {
        return (preco * qtd - ((preco * qtd) * desconto()));
    }

    public abstract double desconto();

    @Override
    public String toString() {
        return  "codigo: " + getCodigo() +
                ", nome: " + getNome() +
                ", qtd: " + getQtd() +
                ", preco: " + getPreco();

    }
}


