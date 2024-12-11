import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double preciototaltela;
        double preciofinal;
        double manoobra;
        float tela = 0;
        System.out.print("Precio metro de tela: ");
        float preciotela = sc.nextFloat();
        System.out.print("Que talla se va a fabricar(30/32/36): ");
        int respuestatalla = sc.nextInt();
        sc.nextLine();
        while (respuestatalla != 30 && respuestatalla != 32 && respuestatalla != 36) {
            System.out.print("Talla no valida. Introduzca una talla valida (30/32/36): ");
            respuestatalla = sc.nextInt();
        }
        System.out.print("Que modelo quieres fabricar(A/B): ");
        String modelo = sc.nextLine();
        while (!modelo.equalsIgnoreCase("A") && !modelo.equalsIgnoreCase("B")) {
            System.out.print("Modelo no valido. Introduzca de nuevo modelo(A/B): ");
            modelo = sc.nextLine();
        }
        if (modelo.equalsIgnoreCase("A")) {
            tela = 1.50F;
        } else if (modelo.equalsIgnoreCase("B")) {
            tela = 1.80F;
        }
        System.out.print("Cuantos pantalones quieres fabricar: ");
        float numeropantalones = sc.nextFloat();
        preciototaltela = tela * numeropantalones * preciotela;

        if (modelo.equalsIgnoreCase("A")) {
            manoobra = preciototaltela * (0.8);
            preciofinal = preciototaltela + manoobra;
        } else {
            manoobra = preciototaltela * (0.95);
            preciofinal = preciototaltela + manoobra;

        }
        if (respuestatalla == 32 || respuestatalla == 36) {
            manoobra = preciofinal * 0.04;
            preciofinal = preciofinal + manoobra;
        }
        System.out.println("El coste final es de " + preciofinal + "€");
        double ingresos = preciofinal * 0.3;
        double ingresosfinales =  ingresos + ingresos;
        double beneficio = preciofinal * 0.3;
        System.out.println("Ingresos finales: " + ingresosfinales + "€");
        System.out.println("Ganancias finales: " + beneficio + "€");
    }
}