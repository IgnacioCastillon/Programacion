import java.time.LocalDate;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anoact = LocalDate.now().getYear();
        int mesact = LocalDate.now().getMonthValue();
        int diaact = LocalDate.now().getDayOfMonth();
        System.out.println("Hoy es " +diaact+"/"+mesact+"/"+anoact);
        System.out.print("Año de nacimiento: ");
        int edad = anoact - sc.nextInt();
        System.out.print("mes de nacimiento: ");
        int mes = sc.nextInt();
        System.out.print("dia de nacimiento: ");
        int dia = sc.nextInt();
        if (mes >= mesact&&diaact<dia) {
            edad--;
            System.out.printf("Tienes " +edad+ " años");
        } else {
            System.out.print("Tienes " + edad + " años");
        }
        sc.close();
    }
}
