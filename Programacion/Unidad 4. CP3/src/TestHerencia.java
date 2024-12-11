public class TestHerencia {
    public static void main(String[] args) {

        productoFresco Producto1 = new productoFresco("16/9/24", 2225, "16/98/1242", "Marruecos");
        productoRefrigerado Producto2 = new productoRefrigerado("16/12/1982", 2145, 25152);
        productoCongelado Producto3 = new productoCongelado("16/9/2003", 24, 224);

        System.out.println(Producto1);
        System.out.println(Producto2);
        System.out.println(Producto3);
    }
}
