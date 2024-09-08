package biblioteca;

public class BibliotecaVirtual extends Biblioteca {

    private String url;

    public BibliotecaVirtual(String nome, String url) {
        super(nome);
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public String toString() {
        return "Biblioteca " + super.getNome() +
                "\n" + url +
                "\n Obras disponíveis: " +
                "\n" + super.getLivros();
    }
}
