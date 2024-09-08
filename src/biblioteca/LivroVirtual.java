package biblioteca;

public class LivroVirtual extends Livro{
    public LivroVirtual(String titulo, String autor, int ano) {
        super(titulo, autor, ano);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n";
    }
}
