public class RelatorioCSV implements Relatorio {
    @Override
    public void gerarRelatorio(Livro livro) {
        System.out.println("Gerando relatório em CSV...");
        System.out.println("Título,Autor,Páginas,Gênero");
        System.out.println(livro.getTitulo() + "," + livro.getAutor() + "," + livro.getPaginas() + "," + livro.getGenero());
        System.out.println("Relatório em CSV gerado com sucesso!");
    }
}
