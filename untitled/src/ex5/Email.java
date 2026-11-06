package ex5;

public class Email implements Notificacao {

    @Override
    public void notificar(String mensagem) {
        System.out.println("Enviando notificação via Email: " + mensagem);
    }
}
