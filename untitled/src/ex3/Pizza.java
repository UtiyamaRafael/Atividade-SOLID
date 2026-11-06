package ex3;

public class Pizza extends Produto{

    public Pizza(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Pizza: " + getNome());
        System.out.println("Preco: R$ " + getPreco());
    }

}
