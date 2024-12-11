import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tarjeta;
        System.out.print("Cantidad de hamburguesas: ");
        int n1 = sc.nextInt();
        sc.nextLine();
        while (n1 <= 0) {
            System.out.print("Número de hamburguesa no permitido. Prueba otra vez: ");
            n1 = sc.nextInt();
        }
        System.out.print("Quieres añadir unas patatas y una bebida mediana por 4€ (SI/NO): ");
        String combowombo = sc.nextLine();
        while (!combowombo.equalsIgnoreCase("si") && !combowombo.equalsIgnoreCase("no")) {
            System.out.print("Respuesta no permitida, prueba otra vez: ");
            combowombo = sc.nextLine();
        }
        System.out.print("Pago con tarjeta (Si/NO): ");
        tarjeta = sc.nextLine();
        while (!tarjeta.equalsIgnoreCase("si") && !tarjeta.equalsIgnoreCase("no")) {
            System.out.println("Respuesta no valida. Escribe si o no: ");
            tarjeta = sc.nextLine();
        }
        int h1 = 5;
        int h2 = 8;
        int h3 = 12;

        int precio1 = n1 * h1;
        int precio2 = n1 * h2;
        int precio3 = n1 * h3;
        int precio4 = n1 * h1 + 4;
        int precio5 = n1 * h2 + 4;
        int precio6 = n1 * h3 + 4;

        int plus1 = precio1 + (precio1 * 5 / 100);
        int plus2 = precio2 + (precio2 * 5 / 100);
        int plus3 = precio3 + (precio3 * 5 / 100);
        int plus4 = precio4 + (precio4 * 5 / 100);
        int plus5 = precio5 + (precio5 * 5 / 100);
        int plus6 = precio6 + (precio6 * 5 / 100);

        if (tarjeta.equalsIgnoreCase("si")) {
            if (combowombo.equalsIgnoreCase("no")) {
                System.out.println("Si el cliente ha pedido hamburguesas sencillas el precio es de " + plus1 + "€");
                System.out.println("Si el cliente ha pedido hamburguesas dobles el precio es de " + plus2 + "€");
                System.out.print("Si el cliente ha pedido hamburguesas triples el precio es de " + plus3 + "€");
            }
            if (combowombo.equalsIgnoreCase("si")) {
                System.out.println("Si el cliente ha pedido hamburguesas sencillas con patatas y bebida el precio es de " + plus4 + "€");
                System.out.println("Si el cliente ha pedido hamburguesas dobles con patatas y bebida el precio es de " + plus5 + "€");
                System.out.print("Si el cliente ha pedido hamburguesas triples con patatas y bebida el precio es de " + plus6 + "€");
            }
        }
        if (tarjeta.equalsIgnoreCase("no")) {
            if (combowombo.equalsIgnoreCase("no")) {
                System.out.println("Si el cliente ha pedido hamburguesas sencillas el precio es de " + precio1 + "€");
                System.out.println("Si el cliente ha pedido hamburguesas dobles el precio es de " + precio2 + "€");
                System.out.print("Si el cliente ha pedido hamburguesas triples el precio es de " + precio3 + "€");
            }
            if (combowombo.equalsIgnoreCase("si")) {
                System.out.println("Si el cliente ha pedido hamburguesas sencillas con patatas y bebida el precio es de " + precio4 + "€");
                System.out.println("Si el cliente ha pedido hamburguesas dobles con patatas y bebida el precio es de " + precio5 + "€");
                System.out.print("Si el cliente ha pedido hamburguesas triples con patatas y bebida el precio es de " + precio6 + "€");
            }
        }
    }
}