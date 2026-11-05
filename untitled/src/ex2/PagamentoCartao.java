package ex2;

public class PagamentoCartao implements Pagamento {

    @Override
    public void pagamento(double valor) {
        System.out.println("Pagamento no cartão de crédito no valor de: " + valor);
    }
}
