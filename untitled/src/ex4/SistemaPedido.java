package ex4;

public class SistemaPedido implements GerenciamentoPedido, GerenciamentoEntrega {

    @Override
    public void criarPedido() {
        System.out.println("Pedido criado com sucesso!");
    }

    @Override
    public void atualizarPedido() {
        System.out.println("Pedido atualizado com sucesso!");
    }

    @Override
    public void statusEntrega(String status) {
        System.out.println("Status da entrega: " + status);
    }
}
