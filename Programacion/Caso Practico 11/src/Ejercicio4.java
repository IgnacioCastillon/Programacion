import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int aleatorio1 = random.nextInt(6) + 1;
        int aleatorio2 = random.nextInt(6) + 1;
        int suma = aleatorio2 + aleatorio1;
        int respuesta = 0;
        int intentos=0;
        boolean acierto = false;
        System.out.print("Cuantos intentos quieres para adivinarlo? ");
        int intentosmax = sc.nextInt();
        while (intentos<intentosmax && !acierto) {
                System.out.print("Adivina la suma de dos numeros entre el 1 y el 6: ");
                respuesta = sc.nextInt();
                intentos++;

                if (respuesta==suma){
                    System.out.print("Has acertado");
                    acierto = true;
                }
                if (respuesta < suma) {
                    System.out.println("La suma es mayor. ");
                }
                if (respuesta > suma) {
                    System.out.println("La suma es menor. ");
                }
            }
        if (!acierto) {
            System.out.print("Has alcanzado los intentos maximos");
        }
        }
    }
