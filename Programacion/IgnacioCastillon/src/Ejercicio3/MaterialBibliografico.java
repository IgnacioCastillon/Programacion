package Ejercicio3;

public class MaterialBibliografico {
    private String titulo;
    private String autor;
    private int añoPublicacion;
    private boolean disponible;

    public MaterialBibliografico(String titulo, String autor, int añoPublicacion, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.disponible = disponible;
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

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "MaterialBibliografico{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", añoPublicacion=" + añoPublicacion +
                ", disponible=" + disponible +
                '}';
    }
    public void prestar() {
        if (!disponible) {
            System.out.println("Material no disponible para préstamo");
        } else {
            disponible = false;
            System.out.println("Material disponible para préstamo");
        }
    }
        public void devolver(){
            disponible = true;
            System.out.println("Material devuelto");
        }
        public void mostrarDetalles(){
            System.out.println("Titulo: "+titulo+"\nAutor: "+autor+"\nAño Publicación: "+añoPublicacion+"\nDisponible: "+disponible);
        }
    }
