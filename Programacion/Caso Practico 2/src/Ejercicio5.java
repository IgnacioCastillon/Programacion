import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Mes actual: ");
        String mes = sc.nextLine();
        System.out.print("Precio: ");
        float precio = sc.nextFloat();


        if (mes.equalsIgnoreCase("Octubre")) {
            float descuento2 = precio*0.15f;
            float precio2 = precio-descuento2;
            System.out.print("El precio final con un 15% de descuento es "+precio2);
        }else{
            System.out.print("El precio final es "+precio);
        }
    }
}
