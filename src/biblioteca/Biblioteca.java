package biblioteca;

import java.util.HashSet;
import java.util.Set;

public class Biblioteca {

    private String nome;
    private Set<Livro> livros = new HashSet<>();

    public Biblioteca(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Livro> getLivros() {
        return livros;
    }

    public void setLivros(Set<Livro> livros) {
        this.livros = livros;
    }

    public void adicionarLivro(Livro livro) {
        this.livros.add(livro);
    }

    @Override
    public String toString() {
        return "Biblioteca " + nome +
                "\n Obras disponíveis: " +
                "\n" + livros;
    }
}
