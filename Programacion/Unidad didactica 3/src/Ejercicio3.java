import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero a partir del cual los 5 siguiente numeros se eleven al cuadrado y al cubo: ");
        int numero = sc.nextInt();
        for (int i = numero; i <= (numero + 4); i++) {
            System.out.println(i + " elevado a 2 es : " + Math.pow(i, 2) + " y al cubo es " + Math.pow(i, 3));
        }
        sc.close();
    }
}
