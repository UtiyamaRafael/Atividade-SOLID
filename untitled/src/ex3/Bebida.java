package ex3;

public class Bebida extends Produto {

    public Bebida(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Bebida: " + getNome());
        System.out.println("Preco: R$ " + getPreco());
    }
}
