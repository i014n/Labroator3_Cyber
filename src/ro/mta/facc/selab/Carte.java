package ro.mta.facc.selab;

public class Carte implements Comparable<Carte> {
    private String titlu;
    private String autor;
    private int anPublicatie;
    private int nrPagini;

    @Override
    public int compareTo(Carte o) {
        return Integer.compare(this.nrPagini, o.nrPagini);
    }

    public Carte(String titlu, String autor, int anPublicatie, int nrPagini) {
        this.titlu = titlu;
        this.autor = autor;
        this.anPublicatie = anPublicatie;
        this.nrPagini = nrPagini;
    }

    public String getTitlu() {
        return titlu;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnPublicatie() {
        return anPublicatie;
    }

    public int getNrPagini() {
        return nrPagini;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnPublicatie(int anPublicatie) {
        this.anPublicatie = anPublicatie;
    }

    public void setNrPagini(int nrPagini) {
        this.nrPagini = nrPagini;
    }

    @Override
    public String toString() {
        return this.titlu + " " + this.autor + ", aparuta in anul " + this.anPublicatie;
    }
}
