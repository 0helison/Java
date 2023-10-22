package ex02.entities;

public class Livro extends Produto implements IDesconto{

    public Livro(int codigo, int qtd, String nome, double preco) {
        super(codigo, qtd, nome, preco);
    }

    @Override
    public double desconto() {
        return 0.1;
    }
}
