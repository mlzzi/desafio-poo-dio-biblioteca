package biblioteca;

public class Livro {

    protected String titulo;
    protected String autor;
    protected int ano;

    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }

    @Override
    public String toString() {
        return "\n    Título = '" + titulo + '\'' +
               "\n    Autor = '" + autor + '\'' +
               "\n    Ano = " + ano ;
    }
}
