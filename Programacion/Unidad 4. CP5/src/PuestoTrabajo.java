public class PuestoTrabajo {
    private String codigo;
    private String descripcion;
    private double sueldobruto;

    public PuestoTrabajo(String codigo, String descripcion, double sueldobruto) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.sueldobruto = sueldobruto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getSueldobruto() {
        return sueldobruto;
    }

    public void setSueldobruto(double sueldobruto) {
        this.sueldobruto = sueldobruto;
    }

    @Override
    public String toString() {
        return "PuestoTrabajo{" +
                "codigo='" + codigo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", sueldobruto=" + sueldobruto +
                '}'+super.toString();
    }
}
