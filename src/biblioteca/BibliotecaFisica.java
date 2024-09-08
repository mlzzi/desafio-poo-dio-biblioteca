package biblioteca;

public class BibliotecaFisica extends Biblioteca {

    private final String endereco;

    public BibliotecaFisica(String nome, String endereco) {
        super(nome);
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public String toString() {
        return "Biblioteca " + super.getNome() +
                "\n" + endereco +
                "\n Obras disponíveis: " +
                "\n" + super.getLivros();
    }
}
