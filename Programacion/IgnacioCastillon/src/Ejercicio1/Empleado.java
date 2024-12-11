package Ejercicio1;

public class Empleado {
    private String nombre;
    private double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", salario=" + salario +
                '}';
    }
    public void calcularsalario(){

    }
    public void trabajar(){
        System.out.println("El empleado está trabajando");
    }

    public void infoEmpleado(){
        System.out.println("Empleado: "+nombre+"\nSalario Base: "+salario);
    }
}
