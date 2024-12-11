package Ejercicio1;

class EmpleadoFreelancer{
    private String nombre;
    private int numeroDeProyectos;

    public EmpleadoFreelancer(String nombre, int numeroDeProyectos) {
        this.nombre = nombre;
        this.numeroDeProyectos = numeroDeProyectos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroDeProyectos() {
        return numeroDeProyectos;
    }

    public void setNumeroDeProyectos(int numeroDeProyectos) {
        this.numeroDeProyectos = numeroDeProyectos;
    }

    @Override
    public String toString() {
        return "EmpleadoFreelancer{" +
                "nombre='" + nombre + '\'' +
                ", numeroDeProyectos=" + numeroDeProyectos +
                '}';
    }

    public double calcularSalario(){
        return numeroDeProyectos * 200;
    }
    public void trabajar(){
        System.out.println("El freelancer está trabajando en proyectos especificos");
    }
    public void infoEmpleado(){
        System.out.println("Empleado: "+nombre+"\nSalario Base= 0.0€");
    }

}
