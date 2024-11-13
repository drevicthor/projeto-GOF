public class RelatorioPDF implements Relatorio{
    @Override
    public void gerarRelatorio(Livro livro) {
        System.out.println("Gerando relatório em PDF...");
        System.out.println("Título: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Páginas: " + livro.getPaginas());
        System.out.println("Gênero: " + livro.getGenero());
        System.out.println("Relatório em PDF gerado com sucesso!");
    }
}
