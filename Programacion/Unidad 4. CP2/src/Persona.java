public class Persona {
    private String Nombre;
    private String Apellido;
    private int telefono;

    public Persona(String nombre, String apellido, int telefono) {
        Nombre = nombre;
        Apellido = apellido;
        this.telefono = telefono;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}


class Cuenta extends Persona{
    private int numeroCuenta;
    private double saldo;

    public Cuenta(String nombre, String apellido, int telefono, int numeroCuenta, double saldo) {
        super(nombre, apellido, telefono);
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public void transaccion(String tipoTransaccion, double cantidad){
        if (tipoTransaccion.equalsIgnoreCase("reintegro")){
            saldo -= cantidad;
        } else if (tipoTransaccion.equalsIgnoreCase("ingreso")) {
            saldo += cantidad;
        }
        System.out.println("Has realizado un "+tipoTransaccion);
        System.out.println("Su saldo es de "+saldo);
    }
    public String toString(){
        return "Nª cuenta: "+numeroCuenta+"\n Saldo: "+saldo;
    }
    public void info(){
        System.out.println("Nombre: "+getNombre());
        System.out.println("Apellido: "+getApellido());
        System.out.println("Telefono: "+getTelefono());
        System.out.println("Numero de cuenta: "+numeroCuenta);
        System.out.println("Saldo: "+saldo);
    }
}
