public class Producto {
    private String nombre;
    private double precio;
    private int cantidadEnStock;

    public Producto(String nombre, double precio, int cantidadEnStock) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadEnStock = cantidadEnStock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadEnStock() {
        return cantidadEnStock;

    }

    public void setCantidadEnStock(int cantidadEnStock) {
        this.cantidadEnStock = cantidadEnStock;
    }
    public void reabastecer(int reabastecimiento){
        if (reabastecimiento<0){
            reabastecimiento=0;
        }
        cantidadEnStock+=reabastecimiento;
        System.out.println("Se han reabastecido "+reabastecimiento+" unidades");

    }

    public void venderProducto(int cantidad) {
        if (cantidad <= cantidadEnStock) {
            cantidadEnStock -= cantidad;
            System.out.println("Se han vendido "+cantidad+" "+nombre);
        }else
            System.out.println("No se dispone de tanto stock");
    }


    public void info(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Precio: "+precio);
    }

    public void stock(){
        System.out.println("Cantidad en stock: "+cantidadEnStock);
    }
}
