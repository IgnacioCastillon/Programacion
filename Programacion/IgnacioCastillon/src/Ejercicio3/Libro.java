package Ejercicio3;

public class Libro extends MaterialBibliografico{
    private String genero;
    private int numeroPaginas;

    public Libro(String titulo, String autor, int añoPublicacion, boolean disponible, String genero, int numeroPaginas) {
        super(titulo, autor, añoPublicacion, disponible);
        this.genero = genero;
        this.numeroPaginas = numeroPaginas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "genero='" + genero + '\'' +
                ", numeroPaginas=" + numeroPaginas +
                '}'+super.toString();
    }
    public void prestar(int dias) {
        if (dias > 14) {
            System.out.println("El libro no puede ser prestado por más de 14 días.");
        } else if (!isDisponible()) {
            System.out.println("Material no disponible para préstamo");
        } else {
            boolean disponible = false;
            System.out.println("Material prestado por " + dias + " días.");
        }
    }

    public void mostrarDetalles(){
        System.out.println("Titulo: "+getTitulo()+"\nAutor: "+getAutor()+"\nAño Publicación: "+getAñoPublicacion()+"\nDisponible: "+isDisponible()+"\nGenero: "+getGenero()+"\nNumero de páginas: "+getNumeroPaginas());
    }
}
