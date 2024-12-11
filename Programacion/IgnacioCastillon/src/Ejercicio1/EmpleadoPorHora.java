package Ejercicio1;

public class EmpleadoPorHora{
    private String nombre;

    public EmpleadoPorHora(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "EmpleadoPorHora{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    public double calcularSalario(int horasTrabajadas, double tarifaPorHora){
        return horasTrabajadas * tarifaPorHora;
    }
    public void trabajar(){
        System.out.println("El empleado por hora está trabajando según las horas asignadas.");
    }
    public void infoEmpleado(){
        System.out.println("Empleado: "+nombre+"\nSalario Base= 0.0€");
    }
}
