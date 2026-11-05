package ex2;

public class PagamentoDinheiro implements Pagamento {
    @Override
    public void pagamento(double valor) {
        System.out.println("Pagamento em dinheiro no valor de: " + valor);
    }

}
