public class NotificaçãoEmail implements Notificacao {
    private Notificacao notificacao;

    public NotificacaoEmail(Notificacao notificacao) {
        this.notificacao = notificacao;
    }

    @Override
    public void enviar(String mensagem, Usuario usuario) {
        notificacao.enviar(mensagem, usuario);
        System.out.println("Enviando notificação por Email para" + usuario.getNome() + "; " + mensagem);
    }
}
