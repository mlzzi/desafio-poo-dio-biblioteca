import biblioteca.*;

public class Main {
    public static void main(String[] args) {

        Biblioteca biblioteca = new BibliotecaFisica("Central", "Travessa dos Flamingos, 49");
        Biblioteca bibliotecaVirtual = new BibliotecaVirtual("Online", "https://github.com/mlzzi/");

        Livro oSenhorDosAneis = new LivroFisico("O Senhor dos Aneis", "J.R.R. Tolkien", 1954, 3);
        Livro guerraDosTronos = new LivroFisico("Guerra dos Tronos", "George R.R. Martin", 1996, 1);
        Livro guiaMochileiro = new LivroFisico("O Guia dos Mochileiros das Galáxias", "Douglas Adams", 1979, 5);

        Livro euRobo = new LivroVirtual("Eu, Robô", "Isaac Asimov", 1950);
        Livro duna = new LivroVirtual("Duna", "Frank Herbert", 1965);
        Livro _1984 = new LivroVirtual("1984", "George Orwell", 1950);

        Usuario joao = new Usuario("João");

        biblioteca.adicionarLivro(oSenhorDosAneis);
        biblioteca.adicionarLivro(guerraDosTronos);
        biblioteca.adicionarLivro(guiaMochileiro);

        bibliotecaVirtual.adicionarLivro(euRobo);
        bibliotecaVirtual.adicionarLivro(duna);
        bibliotecaVirtual.adicionarLivro(_1984);

        System.out.println(biblioteca);
        System.out.println(bibliotecaVirtual);

        joao.emprestarLivro("Guerra dos Tronos", biblioteca);
        joao.emprestarLivro("euRobo", bibliotecaVirtual);
        System.out.println(" ");

        System.out.println(biblioteca);
        System.out.println(joao);

        joao.devolverLivro("Guerra dos Tronos");
        System.out.println(" ");
        joao.devolverLivro("Alice no país das Maravilhas");
        System.out.println(" ");
        System.out.println(biblioteca);

    }
}