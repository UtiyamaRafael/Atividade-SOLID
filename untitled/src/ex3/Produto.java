package ex3;

public class Produto {

    private String nome;
    double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }


    public void exibirInformacoes(){
        System.out.println("Produto: " + nome);
        System.out.println("Preco: R$ " + preco);
    }

}
