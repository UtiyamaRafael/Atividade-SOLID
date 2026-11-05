package ex2;

public class PagamentoPix implements Pagamento {

    @Override
    public void pagamento(double valor) {
        System.out.println("Pagamento via PIX no valor de: " + valor);
    }
}
