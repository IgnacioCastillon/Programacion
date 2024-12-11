package Ejercicio2;

public class ProductoRopa extends Producto{
    private String tamaño;

    public ProductoRopa(String nombre, double precio, int cantidadStock, String tamaño) {
        super(nombre, precio, cantidadStock);
        this.tamaño = tamaño;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "ProductoRopa{" +
                "tamaño='" + tamaño + '\'' +
                '}'+super.toString();
    }
    public double calcularPrecio(){
        if (tamaño.equalsIgnoreCase("l") || tamaño.equalsIgnoreCase("xl")){
            return getPrecio()*1.10;
        }else{
            return getPrecio();
        }
    }
    public void mostrarDetalles(){
        System.out.println("Nombre: "+getNombre()+"\nPrecio: "+getPrecio()+"\nCantidad en Stock: "+getCantidadStock()+"\nTamaño del Producto: "+tamaño);
    }
}
