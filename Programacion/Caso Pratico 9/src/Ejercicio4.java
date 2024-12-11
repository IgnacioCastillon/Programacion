import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Vamos a jugar a adivinar numeros: ");
        System.out.print("Cual es el numero mayor al que puede llegar el numero aleatorio: ");
        int mayor = sc.nextInt();
        mayor++;
        int aleatorio = random.nextInt(mayor);
        System.out.print("Cuantos intentos quieres: ");
        int intentosmax = sc.nextInt();
        int intentos = 0;
        int respuesta;
        boolean acierto = false;
        while (intentos < intentosmax && !acierto) {
            System.out.print("Intenta adivinar el numero entre el 0 y el " + mayor + ": ");
            respuesta = sc.nextInt();
            intentos++;
            if (respuesta== aleatorio){
                System.out.print("Has acertado!!! Eres un puto fiera tio");
                acierto = true;
            }
            while (respuesta < 0 || respuesta > mayor) {
                System.out.println("El numero esta entre el 0 y el " + mayor + ": ");
                respuesta = sc.nextInt();
                intentos++;
            } while (respuesta < aleatorio) {
                System.out.println("El numero es mayor: ");
                intentos++;
                respuesta = sc.nextInt();
            } while (respuesta > aleatorio){
                System.out.println("El numero es menor: ");
                intentos++;
                respuesta = sc.nextInt();
            }
        }
        if (!acierto){
            System.out.print("Intentos maximos alcanzados");
        }
    }
}
