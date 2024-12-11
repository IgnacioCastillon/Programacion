import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Factura neta: ");
        float neto = sc.nextFloat();
        float total = neto+(neto*0.21f);
        System.out.println("La factura total es de "+total+ " €");
        sc.close();
    }
}
