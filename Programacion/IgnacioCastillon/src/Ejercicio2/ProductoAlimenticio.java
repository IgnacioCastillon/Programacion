package Ejercicio2;

public class ProductoAlimenticio extends Producto {
    private String fechaVencimiento;

    public ProductoAlimenticio(String nombre, double precio, int cantidadStock, String fechaVencimiento) {
        super(nombre, precio, cantidadStock);
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    @Override
    public String toString() {
        return "ProductoAlimenticio{" +
                "fechaVencimiento='" + fechaVencimiento + '\'' +
                '}' + super.toString();
    }

    public double calcularPrecio() {
        if (fechaVencimiento.equalsIgnoreCase("Próximo mes")) {
            return getPrecio() * 0.80;
        } else {
            return getPrecio();
        }
    }

    public void mostrarDetalles() {
        System.out.println("Nombre: " + getNombre() + "\nPrecio: " + getPrecio() + "\nCantidad en Stock: " + getCantidadStock() + "\nFecha de vencimiento: " + fechaVencimiento);
    }
}