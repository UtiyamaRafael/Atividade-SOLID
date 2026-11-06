package ex5;

public class Whatsapp implements Notificacao {

    @Override
    public void notificar(String mensagem) {
        System.out.println("Enviando notificação via WhatsApp: " + mensagem);
    }
}
