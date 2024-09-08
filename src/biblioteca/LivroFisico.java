package biblioteca;

public class LivroFisico extends Livro{

    private int volumes;

    public LivroFisico(String titulo, String autor, int ano, int volumes) {
        super(titulo, autor, ano);
        this.volumes = volumes;
    }

    public int getVolumes() {
        return volumes;
    }

    public void emprestaVolume() {
        this.volumes--;
    }

    public void devolveVolume() {
        this.volumes++;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n    Volumes = " + volumes +
                "\n";
    }
}
