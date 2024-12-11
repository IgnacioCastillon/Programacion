public class Empleado {
    private String DNI;
    private String Nombre;
    private String Apellidos;
    private String Domicilio;
    private String CodigoPostal;
    private String Ciudad;
    private String PuestoTrabajo;

    public Empleado(String DNI, String nombre, String apellidos, String domicilio, String codigoPostal, String ciudad, String puestoTrabajo) {
        this.DNI = DNI;
        Nombre = nombre;
        Apellidos = apellidos;
        Domicilio = domicilio;
        CodigoPostal = codigoPostal;
        Ciudad = ciudad;
        PuestoTrabajo = puestoTrabajo;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public void setDomicilio(String domicilio) {
        Domicilio = domicilio;
    }

    public String getCodigoPostal() {
        return CodigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        CodigoPostal = codigoPostal;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String ciudad) {
        Ciudad = ciudad;
    }

    public String getPuestoTrabajo() {
        return PuestoTrabajo;
    }

    public void setPuestoTrabajo(String puestoTrabajo) {
        PuestoTrabajo = puestoTrabajo;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "DNI='" + DNI + '\'' +
                ", Nombre='" + Nombre + '\'' +
                ", Apellidos='" + Apellidos + '\'' +
                ", Domicilio='" + Domicilio + '\'' +
                ", CodigoPostal='" + CodigoPostal + '\'' +
                ", Ciudad='" + Ciudad + '\'' +
                ", PuestoTrabajo='" + PuestoTrabajo + '\'' +
                '}' + super.toString();
    }

    public void getAtributos() {
        System.out.println("DNI: " + getDNI() + "\nApellidos= " + getApellidos() + "\nDomicilio= " + getDomicilio() + "\nCodigo Postal: " + getCodigoPostal() + "\nCiudad: " + getCiudad() + "\nPuesto de trabajo: " + getPuestoTrabajo());
    }
}
