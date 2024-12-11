public class Consultor extends Empleado{
    private String CaterogoriaProfesional;

    public Consultor(String DNI, String nombre, String apellidos, String domicilio, String codigoPostal, String ciudad, String puestoTrabajo, String caterogoriaProfesional) {
        super(DNI, nombre, apellidos, domicilio, codigoPostal, ciudad, puestoTrabajo);
        CaterogoriaProfesional = caterogoriaProfesional;
    }

    public String getCaterogoriaProfesional() {
        return CaterogoriaProfesional;
    }

    public void setCaterogoriaProfesional(String caterogoriaProfesional) {
        CaterogoriaProfesional = caterogoriaProfesional;
    }

    @Override
    public String toString() {
        return "Consultor{" +
                "CaterogoriaProfesional='" + CaterogoriaProfesional + '\'' +
                '}'+super.toString();
    }
}
