import java.time.LocalDate;
import java.time.Year;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int año = LocalDate.now().getYear();
        int mes = LocalDate.now().getMonthValue();
        int dia = LocalDate.now().getDayOfMonth();
        System.out.println("Hoy es " +dia+"/"+mes+"/"+año);
        System.out.print("Nombre empleado: ");
        String nombre = sc.nextLine();
        System.out.print("Sueldo base: ");
        float sueldo = sc.nextFloat();
        float sueldofinal = sueldo*0.80f;
        float robado = sueldo*0.20f;
        System.out.println("El sueldo final de "+nombre+" es "+sueldofinal+" €");
        System.out.println("El estado te ha robado: "+robado);
        sc.close();
    }
}
