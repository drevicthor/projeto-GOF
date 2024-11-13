public class Livro {
    private String titulos;
    private String autor;
    private int paginas;
    private String genero;

    private Livro(String titulo, String autor, int paginas, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public int getPaginas() {
        return paginas;
    }
    public String getGenero() {
        return genero;
    }
    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", paginas=" + paginas +
                ", genero='" + genero + '\'' +
                '}';
    }
    public static class LivroBuilder {
        private String titulo;
        private String autor;
        private int paginas;
        private String genero;

        public LivroBuilder setTitulo(String titulo) {
            this.autor = autor;
            return this;
        }
        public LivroBuilder setPaginas(int paginas) {
            this.paginas = paginas;
            return this;
        }
        public LivroBuilder setGenero(String genero) {
            this.genero = genero;
            return this;
        }
        public Livro build() {
            return new Livro(titulo, autor, paginas, genero);
        }
    }
