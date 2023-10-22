package ex02.entities;

public class Eletronico extends Produto implements IDesconto{
    public Eletronico(int codigo, int qtd, String nome, double preco) {
        super(codigo, qtd, nome, preco);
    }

    @Override
    public double desconto() {
        return 0.05;
    }
}
