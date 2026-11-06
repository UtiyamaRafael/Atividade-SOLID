package ex4;

public class SistemaNotificacao implements Notificacao {

    @Override
    public void notificar(String mensagem) {
        System.out.println("Notificação: " + mensagem);
    }

}
