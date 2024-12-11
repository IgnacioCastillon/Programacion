public class EjercicioEvaluable {
    private String nombre;
    private double precio;
    private int cantidadEnStock;

    public EjercicioEvaluable(String nombre, double precio, int cantidadEnStock) {
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
            System.out.println("Se han vendido "+cantidad+" pergolas");
        }else
            System.out.println("No se dispone de tanto stocck");
    }


    public void info(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Precio: "+precio);
    }

    public void stock(){
        System.out.println("Cantidad en stock: "+cantidadEnStock);
    }

    public static void main(String[] args) {
        EjercicioEvaluable Producto = new EjercicioEvaluable("Pergolas",15.24,50);
        Producto.info();

        Producto.stock();
        Producto.venderProducto(35);
        Producto.stock();
        Producto.reabastecer(60);
        Producto.stock();
        Producto.venderProducto(500);
        Producto.stock();
        Producto.reabastecer(60);
        Producto.stock();
        Producto.venderProducto(50);
        Producto.stock();
        Producto.reabastecer(60);
        Producto.stock();



    }
}
