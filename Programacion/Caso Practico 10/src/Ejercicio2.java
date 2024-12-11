import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Precio kilo uva en €: ");
        float pkv = sc.nextFloat();
        sc.nextLine();
        while (pkv <= 0) {
            System.out.print("Precio no permitido. Vuelva a introducir: ");
            pkv = sc.nextFloat();
        }
        System.out.print("Tipo de uva(A/B): ");
        String tipo = sc.nextLine();
        while (!tipo.equalsIgnoreCase("A") && !tipo.equalsIgnoreCase("B")) {
            System.out.print("Respuesta no permitida. Vuelva a introducir: ");
            tipo = sc.nextLine();
        }
        System.out.print("Tamaño de uva: ");
        int tamaño = sc.nextInt();
        while (tamaño != 1 && tamaño != 2) {
            System.out.print("Tamaño no permitido. Vuelva a introducir: ");
            tamaño = sc.nextInt();
        }
        System.out.print("¿Cuantos Kilos se van a vender? ");
        float kilos = sc.nextFloat();
        while (kilos <= 0) {
            System.out.print("Peso no permitido. Vuelva a introducir: ");
            kilos = sc.nextFloat();
        }

        //Comenzamos con el calculo
        if (tipo.equalsIgnoreCase("A") && tamaño == 1) {
            pkv = pkv + 0.20F;
        } else if (tipo.equalsIgnoreCase("A") && tamaño == 2) {
            pkv = pkv + 0.30F;
        }
        if (tipo.equalsIgnoreCase("B") && tamaño == 1) {
            pkv = pkv - 0.30F;
        } else if (tipo.equalsIgnoreCase("A") && tamaño == 2) {
            pkv = pkv - 0.50F;
        }

        //Calculamos las ganancias
        float ganancias = kilos * pkv;

        //Imprimimos el resultado
        System.out.print("Las ganancias de la venta de " + kilos + " kg de uvas modelo " + tipo + " y tamaño " + tamaño + " a un precio de " + pkv + "€ es de " + ganancias + "€");
    }
}