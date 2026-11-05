package ex1;

import java.util.ArrayList;
import java.util.List;

public class GerenciarPedido {

    private List<Pedido> pedidos = new ArrayList<>();

    public void criarPedido(int id, String produto, double valor) {
        Pedido pedido = new Pedido(id, produto, valor);
        pedidos.add(pedido);
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }
}