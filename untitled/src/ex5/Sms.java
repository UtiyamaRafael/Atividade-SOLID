package ex5;

public class Sms implements Notificacao {

    @Override
    public void notificar(String mensagem) {
        System.out.println("Enviando notificação via SMS: " + mensagem);
    }
}
