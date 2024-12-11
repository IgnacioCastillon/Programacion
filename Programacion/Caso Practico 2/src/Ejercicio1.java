import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String nombre;
        float peso;
        int edad;
        System.out.print("Nombre empleado: ");
        nombre = sc.nextLine();
        System.out.print("Edad: ");
        edad = sc.nextInt();
        System.out.print("Peso: ");
        peso = sc.nextFloat();
        System.out.println("El empleado "+nombre+" tiene "+edad+" años y pesa "+peso+ " Kg");

    }
}
