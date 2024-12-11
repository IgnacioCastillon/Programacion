import java.util.Scanner;

public class Dç {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        System.out.print("Como te llamas: ");
        String Nombre;
        Nombre = sc.nextLine();
        String nombre = "Ana";
        String nombre2 = "Juan";
        String nombre3 = "Pablo";
        if (Nombre.equalsIgnoreCase(nombre)) {
            System.out.println("Ana, vaya nombre de pedazo de zorra");
        } else if (Nombre.equalsIgnoreCase(nombre3)) {
            System.out.println("Pablo, vaya nombre de subnormal que tienes capullo");
        }
        else if (Nombre.equalsIgnoreCase(nombre2)) {
            System.out.println("Juan, vaya nombre de subnormal que tienes capullo");
        }else {
            System.out.println("Pffff " +Nombre+ " que nombre mas bonito");
        }
    }
}
