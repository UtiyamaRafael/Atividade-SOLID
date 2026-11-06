package ex3;

public class Hamburguer extends Produto {

    public Hamburguer(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Hamburguer: " + getNome());
        System.out.println("Preco: R$ " + getPreco());
    }
}
