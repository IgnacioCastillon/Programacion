import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int oponente = random.nextInt(3);
        String oponente2;
        if (oponente == 0) {
            oponente2 = "Piedra";
        } else if (oponente == 1) {
            oponente2 = "Papel";
        } else {
            oponente2 = "Tijeras";
        }
        System.out.print("Piedra papel o tijeras: ");
        String respuesta = sc.nextLine();
        int respuesta2;
        while (!respuesta.equalsIgnoreCase("Piedra") && !respuesta.equalsIgnoreCase("Papel") && !respuesta.equalsIgnoreCase("Tijera")) {
            System.out.print("Respuesta no valida. Vuelva a introducirla: ");
            respuesta = sc.nextLine();
        }
        if (respuesta.equalsIgnoreCase("piedra")) {
            respuesta2 = 0;
        } else if (respuesta.equalsIgnoreCase("papel")) {
            respuesta2 = 1;
        } else {
            respuesta2 = 2;
        }
        if (respuesta2 == oponente) {
            System.out.print("Empate: " + respuesta + " vs " + oponente2);
        } else if (respuesta2 == 0 && oponente == 1) {
            System.out.print("Has perdido, " + oponente2 + " gana a " + respuesta);
        } else if (respuesta2 == 0 && oponente == 2) {
            System.out.print("Has ganado, " + respuesta + " gana a " + oponente2);
        } else if (respuesta2 == 1 && oponente == 2) {
            System.out.print("Has perdido, " + oponente2 + " gana a " + respuesta);
        } else if (respuesta2 == 1 && oponente == 0) {
            System.out.print("Has ganado, " + respuesta + " gana a " + oponente2);
        } else if (respuesta2 == 2 && oponente == 0) {
            System.out.print("Has perdido, " + oponente2 + " gana a " + respuesta);
        } else if (respuesta2 == 2 && oponente == 1) {
            System.out.print("Has ganado, " + respuesta + " gana a " + oponente2);
        }
    }
}
