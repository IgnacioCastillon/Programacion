package Ejercicio3;

public class Revista extends MaterialBibliografico{
    private int numeroEdicion;
    private String mesPublicacion;

    public Revista(String titulo, String autor, int añoPublicacion, boolean disponible, int numeroEdicion, String mesPublicacion) {
        super(titulo, autor, añoPublicacion, disponible);
        this.numeroEdicion = numeroEdicion;
        this.mesPublicacion = mesPublicacion;
    }

    public int getNumeroEdicion() {
        return numeroEdicion;
    }

    public void setNumeroEdicion(int numeroEdicion) {
        this.numeroEdicion = numeroEdicion;
    }

    public String getMesPublicacion() {
        return mesPublicacion;
    }

    public void setMesPublicacion(String mesPublicacion) {
        this.mesPublicacion = mesPublicacion;
    }

    @Override
    public String toString() {
        return "Revista{" +
                "numeroEdicion=" + numeroEdicion +
                ", mesPublicacion='" + mesPublicacion + '\'' +
                '}'+super.toString();
    }
    public void prestar(int dias, String consulta) {
        if (dias > 7) {
            System.out.println("El libro no puede ser prestado por más de 7 días.");
        } else if (consulta.equalsIgnoreCase("interna")) {
            boolean disponible = false;
            System.out.println("Esta revista solo es para consulta interna.");
        } else {
            boolean disponible = false;
            System.out.println("Material prestado por " + dias + " días.");
        }
    }
    public void mostrarDetalles(){
        System.out.println("Titulo: "+getTitulo()+"\nAutor: "+getAutor()+"\nAño Publicación: "+getAñoPublicacion()+"\nDisponible: "+isDisponible()+"\nNúmero de Edición: "+getNumeroEdicion()+"\nMes de publicación: "+getMesPublicacion());
    }
}
