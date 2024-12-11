package Ejercicio3;

public class Tesis extends MaterialBibliografico{
    private String universidad;
    private String campoEstudio;

    public Tesis(String titulo, String autor, int añoPublicacion, boolean disponible, String universidad, String campoEstudio) {
        super(titulo, autor, añoPublicacion, disponible);
        this.universidad = universidad;
        this.campoEstudio = campoEstudio;
    }

    public String getuniversidad() {
        return universidad;
    }

    public void setuniversidad(String universidad) {
        this.universidad = universidad;
    }

    public String getCampoEstudio() {
        return campoEstudio;
    }

    public void setCampoEstudio(String campoEstudio) {
        this.campoEstudio = campoEstudio;
    }

    @Override
    public String toString() {
        return "Tesis{" +
                "universal='" + universidad + '\'' +
                ", campoEstudio='" + campoEstudio + '\'' +
                '}'+super.toString();
    }
    public void prestar(boolean tienePermiso) {
        if (tienePermiso&&isDisponible()) {
            System.out.println("Tesis prestada exitosamente.");
            System.out.println("Material prestado exitosamente.");
        } else if (tienePermiso&&!isDisponible()) {
            System.out.println("Material no disponible para préstamo");
        } else {
            System.out.println("El préstamo de esta tesis requiere permisos especiales.");
        }
    }
    public void mostrarDetalles(){
        System.out.println("Titulo: "+getTitulo()+"\nAutor: "+getAutor()+"\nAño Publicación: "+getAñoPublicacion()+"\nDisponible: "+isDisponible()+"\nUniversidad: "+getuniversidad()+"\nCampo de estudio: "+getCampoEstudio());
    }
}
