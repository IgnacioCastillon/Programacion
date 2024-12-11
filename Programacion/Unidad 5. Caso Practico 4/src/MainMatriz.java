public class MainMatriz {
    public static void main(String[] args) {
        Matriz matriz1 = new Matriz(3);
        Matriz matriz2 = new Matriz(3);

        int[] datosMatriz1 = {3, 2, 1, 1, 2, 3, 2, 3, 1};
        matriz1.asignarDatos(datosMatriz1);

        int[] datosMatriz2 = {1, 1, 2, 2, 1, 1, 1, 2, 1};
        matriz2.asignarDatos(datosMatriz2);

        System.out.println("Matriz 1:");
        matriz1.mostrar();

        System.out.println("\nMatriz 2:");
        matriz2.mostrar();

        matriz1.producto(matriz2);

        System.out.println("\nResultado de multiplicar Matriz 1 por Matriz 2:");
        matriz1.mostrar();
    }
}
