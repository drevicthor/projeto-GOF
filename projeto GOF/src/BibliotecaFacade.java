public class BibliotecaFacade {
    private Biblioteca biblioteca;
    private Notificacao notificacao;

    public BibliotecaFacade() {
        this.biblioteca = Biblioteca.getInstance();
        this.notificacao = new NotificacaoBasica();
        this.notificacao = new NotificacaoEmail(notificacao);
        this.notificacao = new NotificacaoSMS(notificacao);
    }

    public void emprestarLivro(Livro livro, Usuario usuario) {
        if (biblioteca.estaDisponivel(livro)) {
            biblioteca.registrarEmprestimo(livro, usuario);
            notificacao.enviar("Empréstimo realizado: " + livro.getTitulo(), usuario);
            System.out.println("Empréstimo concluído com sucesso!");
        } else {
            System.out.println("Desculpe, o livro não está disponível.");
        }
    }
}
