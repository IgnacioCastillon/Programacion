package Ejercicio3;

public class Main {
    public static void main(String[] args) {
        Libro libro = new Libro("El Quijote", "Miguel de Cervantes", 1605,
                true, "Ficción", 1000);
        Revista revista = new Revista("National Geographic", "Varios", 2024,
                false, 10, "Noviembre");
        Tesis tesis = new Tesis("Inteligencia Artificial", "Juan Pérez", 2020,
                true, "MIT", "Computación");
        // Operaciones con el libro
        libro.mostrarDetalles();
        libro.prestar(14);
        libro.devolver();
        // Operaciones con la revista
        revista.mostrarDetalles();
        revista.prestar();
        // Operaciones con la tesis
        tesis.mostrarDetalles();
        tesis.prestar(false);
        tesis.prestar(true);
    }
}

