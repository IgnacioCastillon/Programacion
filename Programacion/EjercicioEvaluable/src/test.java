public class test {
    public static void main(String[] args) {
        Producto Producto = new Producto("Pergolas",189.24,50);
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
