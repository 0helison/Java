package ex02.entities;

public class Roupa extends Produto implements IDesconto{

    public Roupa(int codigo, int qtd, String nome, double preco) {
        super(codigo, qtd, nome, preco);
    }

    @Override
    public double desconto() {
        return 0;
    }
}
