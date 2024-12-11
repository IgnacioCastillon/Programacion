public class Libro extends Ejemplar{
    private int numeroPaginas;
    private String genero;

    public Libro(String titulo, String autor, int anoPublicacion, int numeroPaginas, String genero) {
        super(titulo, autor, anoPublicacion);
        this.numeroPaginas = numeroPaginas;
        this.genero = genero;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String mostrarInfo(){
        return "Titulo: "+super.getTitulo()+"Autor: "+super.getAutor()+"\nAño Publicación: "+super.getAnoPublicacion()+"\nNumero de Paginas: "+this.numeroPaginas+"\nGenero: "+this.genero;

    }
}
