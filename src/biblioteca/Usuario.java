package biblioteca;

import java.util.HashSet;
import java.util.Set;

public class Usuario {

    private String nome;
    private Set<Livro> livrosEmprestados = new HashSet<>();

    public Usuario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void setLivrosEmprestados(Set<Livro> livrosEmprestados) {
        this.livrosEmprestados = livrosEmprestados;
    }

    public void emprestarLivro(String titulo, Biblioteca biblioteca) {
        boolean livroEncontrado = false;

        for (Livro livro : biblioteca.getLivros()) {
            if (livro.getTitulo().equals(titulo)) {
                livroEncontrado = true;

                if (livro instanceof LivroFisico) {
                    LivroFisico livroFisico = (LivroFisico) livro;
                    if (livroFisico.getVolumes() > 0) {
                        livroFisico.emprestaVolume();
                        livrosEmprestados.add(livroFisico);
                        System.out.println("Livro físico emprestado");
                    } else {
                        System.out.println("Título físico indisponível");
                    }
                } else if (livro instanceof LivroVirtual) {
                    livrosEmprestados.add(livro);
                    System.out.println("Livro digital baixado");
                }
                break;
            }
        }

        if (!livroEncontrado) {
            System.out.println("Título inexistente");
        }
    }


    public void devolverLivro(String titulo) {
        boolean livroEncontrado = false;

        for (Livro livro : livrosEmprestados) {
            if (livro.getTitulo().equals(titulo)) {
                livroEncontrado = true;

                if (livro instanceof LivroFisico) {
                    LivroFisico livroFisico = (LivroFisico) livro;
                    livroFisico.devolveVolume();
                    System.out.println("Livro físico devolvido");
                }
                livrosEmprestados.remove(livro);
                break;
            }
        }

        if (!livroEncontrado) {
            System.out.println(nome + " não tem o livro");
        }
    }


    @Override
    public String toString() {
        return "Usuario " + nome + '\'' +
                ", Livros emprestados: " + livrosEmprestados +
                '}';
    }
}
