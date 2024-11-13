public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = Biblioteca.getInstance();

        UsuarioFactory usuarioFactory = new UsuarioFactory();
        Usuario estudante = usuarioFactory.criarUsuario("Estudante", "Ana");
        Usuario professor = usuarioFactory.criarUsuario("Professor", "Carlos");

        biblioteca.adicionarUsuario(estudante);
        biblioteca.adicinarUsuario(professor);

        Livro livro;
        livro = new Livro.LivroBuilder()
                .setTitulo("Aprendendo Java")
                .setAutor("Maria Silva")
                .setPaginas(300)
                .setGenero("Educação")
                .build();

        biblioteca.adicionarLivro(livro);

        System.out.println("\nRelatório em PDF:");
        Relatorio relatorioPDF = new RelatorioPF();
        relatorioPDF.gerarRelatorio(livro);

        System.out.println("\nRelatório em CSV:");
        Relatorio relatorioCSV = new RelatorioCSV();
        relatorioCSV.gerarRelatorio(Livro);

        BibliotecaFacade bibliotecaFacade = new BibliotecaFacade();
        System.out.println("\nProcessando empréstimo:");
        bibliotecaFacade.emprestarLivro(livro, estudante);
    }
}