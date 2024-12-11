import java.util.Scanner;

public class Prueba2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int multiplicacion;
        System.out.print("Di un numero para multiplicar por 2 hasta que el producto sea 128: ");
        multiplicacion = sc.nextInt() * 2;
        System.out.println("Respuesta incorrecta: " + multiplicacion + ".");
        while (multiplicacion < 128) {
            System.out.println("Incorrecto (" + multiplicacion + ")");
            multiplicacion = multiplicacion * 2;
        }
        if (multiplicacion == 128) {
            System.out.println("La respuesta es correcta: " + multiplicacion + ".");
        } else {
            System.out.println("Respuesta incorrecta: " + multiplicacion + ".");
        }
    }
}