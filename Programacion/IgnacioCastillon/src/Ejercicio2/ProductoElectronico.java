package Ejercicio2;

public class ProductoElectronico extends Producto{
    private int garantia;

    public ProductoElectronico(String nombre, double precio, int cantidadStock, int garantia) {
        super(nombre, precio, cantidadStock);
        this.garantia = garantia;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    @Override
    public String toString() {
        return "ProductoElectronico{" +
                "garantia=" + garantia +
                '}'+super.toString();
    }
    public double calcularPrecio() {
        if (garantia> 2) {
            return 0.90 * getPrecio();
        } else {
            return getPrecio();
        }
    }
    public void mostrarDetalles(){
        System.out.println("Nombre: "+getNombre()+"\nPrecio: "+getPrecio()+"\nCantidad en Stock: "+getCantidadStock()+"\nGarantia: "+garantia+" años");
    }
}
