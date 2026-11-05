package ex1;

public class ExibirPedido {

    public void listarPedidos(GerenciarPedido gerenciador) {

        for (Pedido pedido : gerenciador.getPedidos()) {

            System.out.println(
                    "ID: " + pedido.getId() +
                            ", Produto: " + pedido.getProduto() +
                            ", Valor: " + pedido.getValor()
            );
        }
    }
}