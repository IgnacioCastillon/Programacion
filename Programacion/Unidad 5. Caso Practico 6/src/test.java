import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca(10);
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú de Gestión de Biblioteca ---");
            System.out.println("1. Agregar Libro");
            System.out.println("2. Agregar Revista");
            System.out.println("3. Eliminar Ejemplar");
            System.out.println("4. Mostrar Ejemplares");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el título del libro: ");
                    String tituloLibro = scanner.nextLine();
                    System.out.print("Ingrese el autor del libro: ");
                    String autorLibro = scanner.nextLine();
                    System.out.print("Ingrese el año de publicación: ");
                    int anoLibro = scanner.nextInt();
                    System.out.print("Ingrese el número de páginas: ");
                    int paginasLibro = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese el genero: ");
                    String genero = scanner.nextLine();
                    Libro libro = new Libro(tituloLibro,autorLibro,anoLibro,paginasLibro,genero);
                    biblioteca.agregarEjemplar(libro);
                    break;

                case 2:
                    System.out.print("Ingrese el título de la revista: ");
                    String tituloRevista = scanner.nextLine();
                    System.out.print("Ingrese el autor de la revista: ");
                    String autorRevista = scanner.nextLine();
                    System.out.print("Ingrese el año de publicación: ");
                    int anioRevista = scanner.nextInt();
                    System.out.print("Ingrese el número de edición: ");
                    int edicionRevista = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer
                    System.out.print("Ingrese La frecuencia: ");
                    String frecuencia = scanner.nextLine();
                    Revista revista = new Revista(tituloRevista, autorRevista, anioRevista, edicionRevista, frecuencia);
                    biblioteca.agregarEjemplar(revista);
                    break;

                case 3:
                    System.out.print("Ingrese el título del ejemplar a eliminar: ");
                    String tituloEliminar = scanner.nextLine();
                    biblioteca.eliminarEjemplar(tituloEliminar);
                    break;

                case 4:
                    biblioteca.mostrarEjemplares();
                    break;

                case 5:
                    System.out.println("Gracias por usar el sistema de gestión de la biblioteca.");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}
