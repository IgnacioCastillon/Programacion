public class Administrativo extends Empleado{
    private int antiguedad;

    public Administrativo(String DNI, String nombre, String apellidos, String domicilio, String codigoPostal, String ciudad, String puestoTrabajo, int antiguedad) {
        super(DNI, nombre, apellidos, domicilio, codigoPostal, ciudad, puestoTrabajo);
        this.antiguedad = antiguedad;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }


    @Override
    public String toString() {
        return "Administrativo{" +
                "antiguedad=" + antiguedad +
                '}'+super.toString();
    }
}
