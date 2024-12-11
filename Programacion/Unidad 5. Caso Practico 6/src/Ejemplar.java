public class Ejemplar {
    private String titulo;
    private String autor;
    private int anoPublicacion;

    public Ejemplar(String titulo, String autor, int anoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacion = anoPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacion() {
        return anoPublicacion;
    }

    public void setAñoPublicacion(int anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }
    public String mostrarInfo(){
        System.out.println("Titulo: "+this.titulo+"Autor: "+this.autor+"\nAño Publicación: "+this.anoPublicacion);
        return null;
    }
}
