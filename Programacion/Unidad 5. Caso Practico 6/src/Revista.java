public class Revista extends Ejemplar{
    private int edicion;
    private String frecuencia;

    public Revista(String titulo, String autor, int anoPublicacion, int edicion, String frecuencia) {
        super(titulo, autor, anoPublicacion);
        this.edicion = edicion;
        this.frecuencia = frecuencia;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public String getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }
    public String mostrarInfo(){
        System.out.println("Titulo: "+super.getTitulo()+"Autor: "+super.getAutor()+"\nAño Publicación: "+super.getAnoPublicacion()+"\nNumero de Edición: "+this.edicion+"\nFrecuencia de Publicación: "+this.frecuencia);

        return null;
    }
}
