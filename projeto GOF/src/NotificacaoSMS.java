public class NotificacaoSMS implements Notificacao {
    private Notificacao notificacao;

    public NptificacaoSMS(Notificacao notificacao) {
        this.notificacao = notificacao;
    }

    @Override
    public void enviar(String mensagem, Usuario usuario) {
        notificacao.enviar(mensagem, ususario);
        System.out.println("Enviando notificacao por SMS para" + usuario.getNome() + ": " + mensagem);
    }
}
