public class alumno {
    private String Nombre;
    private int Edad;
    private String Clase;
    private double nota;

    public alumno(String nombre, int edad, String clase, double nota) {
        Nombre = nombre;
        Edad = edad;
        Clase = clase;
        this.nota = nota;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public String getClase() {
        return Clase;
    }

    public void setClase(String clase) {
        Clase = clase;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "alumno{" +
                "Nombre='" + Nombre + '\'' +
                ", Edad=" + Edad +
                ", Clase='" + Clase + '\'' +
                ", nota=" + nota +
                '}';
    }
}
