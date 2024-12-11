package Ejercicio1;

public class EmpleadoTiempoCompleto extends Empleado{
    public EmpleadoTiempoCompleto(String nombre, double salario) {
        super(nombre, salario);
    }

    public double calcularSalario() {
        double nuevoSalario = super.getSalario() + 500.00;
        super.setSalario(nuevoSalario);
        return nuevoSalario;
    }
    public void trabajar(){
        System.out.println("El empleado de tiempo completo está trabajando en un horario regular");
    }
}
